package com.klef.REST;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="usersignup")
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usersignup")
public class Signup_entity {
    @Id
    String id;
    String fullname;
    String phoneNumber;
    String email;
    String password;
    String url;
   
	public Signup_entity(String email)
    {
      this.email = email;
    }
    public Signup_entity() {
    }

    public Signup_entity(String fullname, String phoneNumber, String email, String password) {
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.url = url;
    }

    // Getters and setters for other fields

    public String getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
    
}
