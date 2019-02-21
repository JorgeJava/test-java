package br.com.blz.testjava.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.blz.testjava.dto.ProdutoDTO;

public interface IProdutoService {

	ProdutoDTO consultaProduto() throws NumberFormatException, FileNotFoundException, IOException;

	ProdutoDTO buscarProdutoPorSku(int sku) throws NumberFormatException, FileNotFoundException, IOException;

	void deletarProdutoPorSku(int sku) throws NumberFormatException, FileNotFoundException, IOException;
	
	void altearProdutoPorSku(ProdutoDTO produto) throws NumberFormatException, FileNotFoundException, IOException;

	void criarProduto(ProdutoDTO produto) throws NumberFormatException, FileNotFoundException, IOException;
}
