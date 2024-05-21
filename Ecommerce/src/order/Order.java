package order;

import java.util.List;

import Product.Product;

public class Order implements Orders {
	
	private int orderId; 
	private int customerId;
	private String orderDate;
	private String orderStatus; 
	private List<Product> orderedProducts;
	
	public Order(int orderId, int customerId, String orderDate, String orderStatus, List<Product> orderedProducts) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.orderedProducts = orderedProducts;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<Product> getOrderedProducts() {
		return orderedProducts;
	}

	public void setOrderedProducts(List<Product> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}

	public String getOrderDetails() {
		
        return "Order ID: " + orderId + ", Customer ID: " + customerId + ", Order Date: " + orderDate + ", Order Status: " + orderStatus;
	}
	
	public void updateOrderStatus(String status) {
		setOrderStatus(status);
        System.out.println("Order status updated to: " + status);
	}


	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Order Placed: "+getOrderDetails());
	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		System.out.println("Cancel Order: "+getOrderDetails());
	}

	@Override
	public void trackOrder() {
		// TODO Auto-generated method stub
		System.out.println("Order Tracking: "+getOrderDetails());
		
	}

	
}
