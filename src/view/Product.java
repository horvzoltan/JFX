package view;

public class Product {
	int ID;
	String productName;
	int productPrice;
	int currentStock;
	
	public Product(int iD, String productName, int productPrice, int currentStock) {
		this.ID = iD;
		this.productName = productName;
		this.productPrice = productPrice;
		this.currentStock = currentStock;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getCurrentStock() {
		return currentStock;
	}
	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}
	
	
}
