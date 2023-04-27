package model;

import java.security.MessageDigest;

import services.MainService;

public abstract class User extends Person{
	private String encodedPassword;
	private String email;
	private String username;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String inputUsername) {
		if(inputUsername != null && inputUsername.matches("[a-z0-9.]{8,20}")) {
			username = inputUsername;
		}
		else {
			username = "default.user";
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String inputEmail) {
		if(inputEmail != null && inputEmail.matches("[a-z]+[0-9]{2}[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+[a-z$]")) {
			email = inputEmail;
		}
		else {
			
			email = "default.email";
		}
	}
	public String getEncodedPassword() {
		return encodedPassword;
	}
	
	public void setEncodedPassword(String inputEncodedPassword) {
		if(inputEncodedPassword != null && inputEncodedPassword.matches("[A-Za-z0-9]{8,20}")) {
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(inputEncodedPassword.getBytes());
				encodedPassword = new String(md.digest());	
			}
			catch (Exception e) {
				encodedPassword = "defaultPassword";
				}
			}
		else {
			encodedPassword = "defaultPassword";
		}
	}
	
	
	
	//3.constructors
	//no-args
	public User() {
		super();
		setUsername("default.user");
		setEncodedPassword("defaultPassword");
		setEmail("default.email");
	}
	
	//args
	public User(String name, String surname, String username, String password) {
		super();
		setUsername(username);
		setEncodedPassword(password);
		setEmail(email);
	}
	
	
	public String toString() {
		return "" + super.toString() + " " + email + " " + username;
	}
	
	
	//TODO сделать проверку не существует ли какой-либо эмайл либо юзер либбо пароль уже
	//TODO проверить нужно ли это - .equals("")
	public void signUp() throws Exception {
		if(username == null && username.equals("")) {
			throw (new Exception("Username is required"));
		}
		if(encodedPassword == null && encodedPassword.equals("")) {
			throw (new Exception("Password is required"));
		}
		if(email == null && email.equals("")) {
			throw (new Exception("Email is required"));
		}
		createUser(username, encodedPassword, email);
	}
	
	public abstract User createUser(String username, String encodedPassword, String email);
	
	
	public boolean login() {
		for(User temp: MainService.allUsers) {
			if(temp.getUsername().equals(username) 
					&& temp.getEncodedPassword().equals(encodedPassword)) {
				return true;
			}
		}
		return false;
	}
	
	//TODO bookABook()
	//TODO ExtendExpiringDate()
}
