package br.com.blz.testjava.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.blz.testjava.dto.ProdutoDTO;

public interface IProdutoDAO {

	ProdutoDTO valoresBaseMockada() throws FileNotFoundException, NumberFormatException, IOException;

	void alterarValoresBaseMockada(ProdutoDTO produto) throws NumberFormatException, IOException;
	
	void deletarValoresBaseMockada() throws IOException;

	void criarValoresBaseMockada(ProdutoDTO produto) throws NumberFormatException, IOException;
	
}
