package com.example.user_login;

public class UserLogin {
	private String login;
	private String password;
	
	/**
	 * 
	 * @param login
	 * @param password
	 */
	public UserLogin(String login, String password) throws UserLoginException {
		if(validarUserLogin(login,password)==false){
			throw new UserLoginException();
		}
		this.login = login;
		this.password = password;
	}
	
	/**
	 * 
	 * @param login
	 * @param password
	 * @return
	 */
	private static boolean validarUserLogin(String login, String password){
		
		if(login.equals("Admin") && password.equals("1234")){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserLogin [login=" + login + ", password=" + password + "]";
	}
	
	
	
}
