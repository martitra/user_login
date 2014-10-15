package com.example.user_login;

public class UserLoginException extends Exception {

	public UserLoginException() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param detailMessage
	 * esto es para poner los errores se podrían poner personalizados
	 */
	public UserLoginException(String detailMessage) {
		super(detailMessage);
		// TODO Auto-generated constructor stub
	}

}
