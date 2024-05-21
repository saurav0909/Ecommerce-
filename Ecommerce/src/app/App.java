package app;

import java.util.Scanner;

import Product.Product;
import admin.Admin;
import customer.Customer;
import order.Order;
import userauthentication.UserAuthentication;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserAuthentication userauthentication=new UserAuthentication();
		
		Admin admin = new Admin(1, "admin1", 123, "admin@example.com");
		
        Customer customer = new Customer(1, "saurav", 123, "john@example.com");
                
        Product product1=new Product(111, "Laptop", 25000, 1, "Electronics");
        Product product2=new Product(222, "Mobile", 15000, 2, "Electronics");
    
        Order order=new Order(1111, 1, "20-05-2024", "Processing", customer.cart);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Which screen do you want");
        System.out.println("Admin : 1");
        System.out.println("Customer : 2");
        System.out.println("Order : 3");
        int flag=sc.nextInt();
        
        if(flag==1) {
        	System.out.println("Add Admin : 1");
        	System.out.println("Add Product : 2");
        	System.out.println("Remove Product : 3");
        	System.out.println("Update Product : 4");
        	System.out.println("View Profile : 5");
        	System.out.println("Update Profile : 6");
        	int ch=sc.nextInt();
        	
        	switch (ch) {
			case 1: {
					userauthentication.register(admin);
					userauthentication.login("admin1", 123);
				break;
			}
			case 2: {
					admin.addProduct(product1);
				break;
			}
			case 3: {
					admin.removeProduct(product2);
				break;
			}
			case 4: {
					admin.updateProduct(product1);
				break;
			}
			case 5: {
					admin.viewProfile();
				break;
			}
			case 6: {
					admin.updateProfile();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
        	
        	userauthentication.logout(admin);
        	
        }else if(flag==2) {
        	System.out.println("Register Customer and login : 1");
        	System.out.println("Add Product in cart : 2");
        	System.out.println("Remove Product in cart : 3");
        	System.out.println("Checkout : 4");
        	System.out.println("View Profile : 5");
        	System.out.println("Update Profile : 6");
        	int ch=sc.nextInt();
        	switch (ch) {
			case 1: {
					userauthentication.register(customer);
					userauthentication.login("saurav", 123);
				break;
			}
			case 2: {
					customer.addToCart(product1);
				break;
			}
			case 3: {
					customer.removeFromCart(product2);
				break;
			}
			case 4: {
					customer.checkout();
				break;
			}
			case 5: {
					customer.viewProfile();
				break;
			}
			case 6: {
					customer.updateProfile();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
        	userauthentication.logout(customer);
        }else if(flag==3) {
        	System.out.println("Order Details : 1");
        	System.out.println("Update Order Status : 2");
        	System.out.println("Place Order : 3");
        	System.out.println("Cancel Order : 4");
        	System.out.println("Track Order : 5");
        	
        	int ch=sc.nextInt();
        	
        	switch (ch) {
			case 1: {
					String orderDetails=order.getOrderDetails();
			        System.out.println(orderDetails);
				break;
			}
			case 2: {
					order.updateOrderStatus("Shipped");
				break;
			}
			case 3:	{
					order.placeOrder();
				break;
			}
			case 4 : {
					order.cancelOrder();
				break;
			}
			case 5 : {
					order.trackOrder();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
        }
        
        
        
	}
}
