package br.com.blz.testjava.dto;

import java.util.List;

public class InventoryDTO {
	
	private int quantity;
	private List<WarehousesDTO> warehourses;
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public List<WarehousesDTO> getWarehourses() {
		return warehourses;
	}
	public void setWarehourses(List<WarehousesDTO> warehourses) {
		this.warehourses = warehourses;
	}
	
	
	

//	   "inventory": {
//    "quantity": 15,
//    "warehouses": [
//        {
//            "locality": "SP",
//            "quantity": 12,
//            "type": "ECOMMERCE"
//        },
//        {
//            "locality": "MOEMA",
//            "quantity": 3,
//            "type": "PHYSICAL_STORE"
//        }
//    ]
//},
	   
	   
	
}
