package com.klef.REST;



public interface UserDAOIN {
	void insertUser(Signup_entity s);
//	public Signup_entity loginUser(String email, String password);
	public Signup_entity getUserByEmail(String email);
}
