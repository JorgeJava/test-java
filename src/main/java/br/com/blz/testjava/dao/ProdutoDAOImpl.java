package br.com.blz.testjava.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import br.com.blz.testjava.dto.InventoryDTO;
import br.com.blz.testjava.dto.ProdutoDTO;
import br.com.blz.testjava.dto.WarehousesDTO;

@Repository
public class ProdutoDAOImpl implements IProdutoDAO{

	
//	{
//	    "sku": 43264,
//	    "name": "L'Oréal Professionnel Expert Absolut Repair Cortex Lipidium - Máscara de Reconstrução 500g",
//	    "inventory": {
//	        "quantity": 15,
//	        "warehouses": [
//	            {
//	                "locality": "SP",
//	                "quantity": 12,
//	                "type": "ECOMMERCE"
//	            },
//	            {
//	                "locality": "MOEMA",
//	                "quantity": 3,
//	                "type": "PHYSICAL_STORE"
//	            }
//	        ]
//	    },
//	    "isMarketable": true
//	}
	
	
	@Override
	public ProdutoDTO valoresBaseMockada() throws NumberFormatException, IOException {
		
//		File arquivo = new File("C:\\Users\\jorge\\Documents\\ESTUDOS\\TESTE_EMPRESAS\\bd.txt");
//								\test-java\src\main\java\br\com\blz\testjava\dao\bd.txt
		File arquivo = new File("..\\test-java\\src\\main\\java\\br\\com\\blz\\testjava\\dao\\bd.txt");
		
		FileInputStream fileInput = new FileInputStream(arquivo);
		InputStreamReader isr = new InputStreamReader(fileInput, "ISO-8859-1");
		BufferedReader reader = new BufferedReader(isr);
		
		ProdutoDTO produto = new ProdutoDTO();
		produto.setSku(Integer.valueOf(reader.readLine()));
		produto.setName(reader.readLine());
		produto.setInventory(new InventoryDTO());
		produto.getInventory().setQuantity(Integer.valueOf(reader.readLine()));
		
		//Primeiro item do warehouses
		produto.getInventory().setWarehourses(new ArrayList<WarehousesDTO>());
		WarehousesDTO warehouses = new WarehousesDTO();
		warehouses.setLocality(reader.readLine());
		warehouses.setQuantity(Integer.valueOf(reader.readLine()));
		warehouses.setType(reader.readLine());
		produto.getInventory().getWarehourses().add(warehouses);
		
		WarehousesDTO warehouses2 = new WarehousesDTO();
		//Segundo item do warehouses
		warehouses2.setLocality(reader.readLine());
		warehouses2.setQuantity(Integer.valueOf(reader.readLine()));
		warehouses2.setType(reader.readLine());
		produto.getInventory().getWarehourses().add(warehouses2);
		
		reader.close();
		isr.close();
		fileInput.close();
		
		return produto;
	}
	
	
	@Override
	public void alterarValoresBaseMockada(ProdutoDTO produto) throws NumberFormatException, IOException {
		
		File arquivo = new File("..\\test-java\\src\\main\\java\\br\\com\\blz\\testjava\\dao\\bd.txt");
		arquivo.delete();
		FileWriter arquivoWriter = new FileWriter("..\\test-java\\src\\main\\java\\br\\com\\blz\\testjava\\dao\\bd.txt");
	    PrintWriter gravarArq = new PrintWriter(arquivoWriter);
	    
	    gravarArq.printf(String.valueOf(produto.getSku())+"\n");
	    gravarArq.printf(produto.getName()+"\n");
	    gravarArq.printf(String.valueOf(produto.getInventory().getQuantity())+"\n");
	    
	    gravarArq.printf(produto.getInventory().getWarehourses().get(0).getLocality()+"\n");
	    gravarArq.printf(String.valueOf(produto.getInventory().getWarehourses().get(0).getQuantity())+"\n");
	    gravarArq.printf(produto.getInventory().getWarehourses().get(0).getType()+"\n");
	    
	    gravarArq.printf(produto.getInventory().getWarehourses().get(1).getLocality()+"\n");
	    gravarArq.printf(String.valueOf(produto.getInventory().getWarehourses().get(1).getQuantity())+"\n");
	    gravarArq.printf(produto.getInventory().getWarehourses().get(1).getType()+"\n");
	    
	    gravarArq.close();
	    arquivoWriter.close();
	    
	}
	
	
	@Override
	public void deletarValoresBaseMockada() throws IOException{
		File arquivo = new File("..\\test-java\\src\\main\\java\\br\\com\\blz\\testjava\\dao\\bd.txt");
		arquivo.delete();
		FileWriter arquivoWriter = new FileWriter("..\\test-java\\src\\main\\java\\br\\com\\blz\\testjava\\dao\\bd.txt");
	    PrintWriter gravarArq = new PrintWriter(arquivoWriter);
	    
	    gravarArq.close();
	    arquivoWriter.close();
	}
	
	
	@Override
	public void criarValoresBaseMockada(ProdutoDTO produto) throws NumberFormatException, IOException {
		FileWriter arquivoWriter = new FileWriter("..\\test-java\\src\\main\\java\\br\\com\\blz\\testjava\\dao\\bd.txt");
	    PrintWriter gravarArq = new PrintWriter(arquivoWriter);
	    
	    gravarArq.printf(String.valueOf(produto.getSku())+"\n");
	    gravarArq.printf(produto.getName()+"\n");
	    gravarArq.printf(String.valueOf(produto.getInventory().getQuantity())+"\n");
	    
	    gravarArq.printf(produto.getInventory().getWarehourses().get(0).getLocality()+"\n");
	    gravarArq.printf(String.valueOf(produto.getInventory().getWarehourses().get(0).getQuantity())+"\n");
	    gravarArq.printf(produto.getInventory().getWarehourses().get(0).getType()+"\n");
	    
	    gravarArq.printf(produto.getInventory().getWarehourses().get(1).getLocality()+"\n");
	    gravarArq.printf(String.valueOf(produto.getInventory().getWarehourses().get(1).getQuantity())+"\n");
	    gravarArq.printf(produto.getInventory().getWarehourses().get(1).getType()+"\n");
	    
	    gravarArq.close();
	    arquivoWriter.close();
	    
	}
	
	
	
}
