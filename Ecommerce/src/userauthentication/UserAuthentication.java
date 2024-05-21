package userauthentication;

import java.util.HashMap;
import java.util.Map;

import user.User;

public class UserAuthentication {
	
	private Map<String, User> users=new HashMap<>();
	
	public void register(User user){
		
		if(!users.containsKey(user.getUserName())) {
			users.put(user.getUserName(), user);
			System.out.println("Registered Successfully");
		}else
			System.out.println("Username already exists.");
	}
	
	public void login(String username,int password){
		User user=users.get(username);
		if(user != null ) {
			user.login();
		}else
			System.out.println("Something wrong");
	}
	
	public void logout(User user){
		user.logout();
	}

}
