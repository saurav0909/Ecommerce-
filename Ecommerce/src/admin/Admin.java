package admin;

import Product.Product;
import user.User;

public class Admin extends User {
	
	public Admin(int userId, String username, int password, String email) {
			super(userId, username, password, email);
	}
	
	public void addProduct(Product product) {
        System.out.println("Product " + product.getProductName() + " added by admin.");
        // Add product logic
	}
	
	public void removeProduct(Product product) {
        System.out.println("Product " + product.getProductName() + " removed by admin.");
        // Remove product logic
	}
	
	public void updateProduct(Product product) {
        System.out.println("Product " + product.getProductName() + " updated by admin.");
        // Update product logic
	}

	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		System.out.println("Viewing profile for admin: " + getUserName());
	}

	@Override
	public void updateProfile() {
		// TODO Auto-generated method stub
		System.out.println("Updating profile for admin: " + getUserName());
		
	}

}
