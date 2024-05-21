package user;

public abstract class User {
	
	private int userId;
	private String userName;
	private int password;
	private String email;
	public User() {
		
	}
	public User(int userId, String userName, int password, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract void viewProfile();
	public abstract void updateProfile();
	
	public void login() {
		System.out.println(userName+ "logged in.");
	}
	
	public void logout() {
		System.out.println(userName+ "logged out.");
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ "]";
	}
	
	
	

}
