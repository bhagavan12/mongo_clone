package com.klef.REST;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("https://dealsblendr.netlify.app")
//@CrossOrigin("http://localhost:3000/")
public class UserController {

    private final UserDAOClass userDAO;

    public UserController(UserDAOClass userDAO) {
        this.userDAO = userDAO;
    }

    @PostMapping(value = "/user")
    void addUser(@RequestBody Signup_entity user) {
        userDAO.insertUser(user);
    }

    @PostMapping("/email/{email}")
    public ResponseEntity<Signup_entity> getUserByEmail(@PathVariable String email, @RequestBody Signup_entity user) {
        Signup_entity foundUser = userDAO.getUserByEmail(email);

        if (foundUser != null) {
            if (user.getPassword().equals(foundUser.getPassword())) {
                return new ResponseEntity<>(foundUser, HttpStatus.OK);
            } else {
                Signup_entity invalidUser = new Signup_entity("1");
                return new ResponseEntity<>(invalidUser, HttpStatus.OK);
            }
        } else {
            Signup_entity notFoundUser = new Signup_entity("1");
            return new ResponseEntity<>(notFoundUser, HttpStatus.OK);
        }
    }
}
