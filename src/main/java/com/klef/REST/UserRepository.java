package com.klef.REST;


//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

//public interface UserRepository extends JpaRepository<Signup_entity,Integer>{
//	Signup_entity findByEmail(String email);
//}
public interface UserRepository extends MongoRepository<Signup_entity, String> {
    Signup_entity findByEmail(String email);
}

//	@Query("select s from Signup_entity s where s.email=?1 and s.password=?2")
//	  public Signup_entity loginUser(String email,String password);