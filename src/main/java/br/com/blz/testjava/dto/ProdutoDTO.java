package br.com.blz.testjava.dto;

public class ProdutoDTO {
	
	
	private int sku;
	private String name;
	private InventoryDTO inventory;
	private boolean isMarketable;
	
	
	public int getSku() {
		return sku;
	}
	public void setSku(int sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public InventoryDTO getInventory() {
		return inventory;
	}
	public void setInventory(InventoryDTO inventory) {
		this.inventory = inventory;
	}
	public boolean isMarketable() {
		return isMarketable;
	}
	public void setMarketable(boolean isMarketable) {
		this.isMarketable = isMarketable;
	}
	
	
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

}
