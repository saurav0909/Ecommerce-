package Product;

public class Product {
	
	private int productID;
	private String productName;
	private int price;
	private int quantity;
	
	
	public Product(int productID, String productName, int price, int quantity, String category) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	
	private String category;
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getProductDetails(){
		return "Product Id:" + productID + "Product Name:" + productName + "Product Price" + price +  "Product Quantity" + quantity  + "Product Category" +category;
	}
	

	public void updateQuantity(int newQuantity){
		setQuantity(newQuantity);
		System.out.println("Product quantity updated");
	}
	
	public void updatePrice(int newPrice){
		setPrice(newPrice);
		System.out.println("Product price updated");
	}

}
