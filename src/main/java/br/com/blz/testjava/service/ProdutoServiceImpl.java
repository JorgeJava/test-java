package br.com.blz.testjava.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.blz.testjava.dao.IProdutoDAO;
import br.com.blz.testjava.dto.ProdutoDTO;
import br.com.blz.testjava.dto.WarehousesDTO;

@Service
public class ProdutoServiceImpl implements IProdutoService {

	@Autowired
	private IProdutoDAO produtoDAO;
	
	
	@Override
	public ProdutoDTO consultaProduto() throws NumberFormatException, FileNotFoundException, IOException {
		ProdutoDTO produto;
		
		produto = produtoDAO.valoresBaseMockada();
		
		return produto;
	}
	
	@Override
	public ProdutoDTO buscarProdutoPorSku(int sku) throws NumberFormatException, FileNotFoundException, IOException {
		
		ProdutoDTO produto;
		ProdutoDTO produtoRetorno = new ProdutoDTO();
		produto = consultaProduto();
		
		if (sku == produto.getSku()) {
			produtoRetorno = produto;
			
			produtoRetorno.getInventory().setQuantity(somaQuantity(produto));
			produtoRetorno.setMarketable(validaMarketable(produto));
		}
		
		return produtoRetorno;
	}

	
	
	public int somaQuantity(ProdutoDTO produtoParam){
		int soma = 0;
		for (WarehousesDTO warehourses : produtoParam.getInventory().getWarehourses()) {
			soma = warehourses.getQuantity() + soma;
			
		}
		return soma;
	}
	
	
	public boolean validaMarketable(ProdutoDTO produtoParam){
		boolean valido = false;
		
		if (produtoParam.getInventory().getQuantity() > 0) {
			valido = true;
		}
		
		return valido;
	}

	
	@Override
	public void altearProdutoPorSku(ProdutoDTO produto) throws NumberFormatException, FileNotFoundException, IOException{
		ProdutoDTO produtoBusca = buscarProdutoPorSku(produto.getSku());
		
		if (produtoBusca.getSku() != 0) {
			produtoDAO.alterarValoresBaseMockada(produto);
		}
		
	}
	
	
	@Override
	public void deletarProdutoPorSku(int sku) throws NumberFormatException, FileNotFoundException, IOException {
		ProdutoDTO produtoBusca = buscarProdutoPorSku(sku);
		
		if (produtoBusca.getSku() != 0) {
			produtoDAO.deletarValoresBaseMockada();
		}
		
	}
	
	
	
	@Override
	public void criarProduto(ProdutoDTO produto) throws NumberFormatException, FileNotFoundException, IOException{
		ProdutoDTO produtoBusca = buscarProdutoPorSku(produto.getSku());
		
		if (produtoBusca.getSku() != 0) {
			throw new ArithmeticException("Sku já existente");
		}else {
			produtoDAO.criarValoresBaseMockada(produto);
		}
		
	}
	
	
}
