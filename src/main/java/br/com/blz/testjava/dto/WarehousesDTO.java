package br.com.blz.testjava.dto;

public class WarehousesDTO {

	private String locality;
	private int quantity;
	private String type;
	
	
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
//  "warehouses": [
//  {
//      "locality": "SP",
//      "quantity": 12,
//      "type": "ECOMMERCE"
//  },
//  {
//      "locality": "MOEMA",
//      "quantity": 3,
//      "type": "PHYSICAL_STORE"
//  }
//]
	
}
