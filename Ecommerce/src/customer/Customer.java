package customer;

import java.util.ArrayList;
import java.util.List;

import Product.Product;
import user.User;

public class Customer extends User{
	
	public List<Product> cart;
	
	public Customer(int userId, String userName, int password, String email) {
		super(userId, userName, password, email);
		this.cart=new ArrayList<>();
	}
	
	public void addToCart(Product product){
		cart.add(product);
		System.out.println("Product Add");
	}
	
	public void removeFromCart(Product product) {
		cart.remove(product);
		System.out.println("Product Remove");
	}
	
	public void checkout(){
		System.out.println("Checkout started");
	}
	@Override
	public void viewProfile(){
		System.out.println("View Profile: "+getUserName());
	}
	
	@Override
	public void updateProfile() {
		System.out.println("Update Profile: "+getUserName());
	}

	@Override
	public String toString() {
		return "Customer [cart=" + cart + "]";
	}
	
	

}
