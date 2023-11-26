package com.klef.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAOClass implements UserDAOIN {

    @Autowired
    private final UserRepository userRepository;

    public UserDAOClass(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void insertUser(Signup_entity user) {
        userRepository.save(user);
    }

    public Signup_entity getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}


//@Override
//public Signup_entity loginUser(String email, String password) {
//  
//  return sr.loginUser(email,password);
//}
