package br.com.blz.testjava.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.blz.testjava.dto.ProdutoDTO;
import br.com.blz.testjava.service.IProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private IProdutoService produtoService;
	

	@RequestMapping(value = "/consultaProduto", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public ProdutoDTO consultaProduto() throws NumberFormatException, FileNotFoundException, IOException{

		ProdutoDTO produto;
		
		produto = produtoService.consultaProduto();
		
		return produto;
	}
	
	
	@RequestMapping(value = "/buscarProdutoPorSku/{sku}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public ProdutoDTO buscarProdutoPorSku(@PathVariable int sku) throws NumberFormatException, FileNotFoundException, IOException{

		ProdutoDTO produto;
		
		produto = produtoService.buscarProdutoPorSku(sku);
		
		return produto;
	}
	
	
	@RequestMapping(value = "/altearProdutoPorSku", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
	"application/json" })
	@ResponseStatus(value = HttpStatus.OK)
	public void altearProdutoPorSku(@RequestBody ProdutoDTO produtoDTO) throws NumberFormatException, FileNotFoundException, IOException{

		produtoService.altearProdutoPorSku(produtoDTO);
		
	}
	
	
	@RequestMapping(value = "/deletarProdutoPorSku", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
	"application/json" })
	@ResponseStatus(value = HttpStatus.OK)
	public void deletarProdutoPorSku(@RequestBody ProdutoDTO produtoDTO) throws NumberFormatException, FileNotFoundException, IOException {
		produtoService.deletarProdutoPorSku(produtoDTO.getSku());
	}	
	
	
	@RequestMapping(value = "/criarProduto", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
	"application/json" })
	@ResponseStatus(value = HttpStatus.OK)
	public void criarProduto(@RequestBody ProdutoDTO produtoDTO) throws NumberFormatException, FileNotFoundException, IOException{

		produtoService.criarProduto(produtoDTO);
		
	}
	
	
}
