package com.klef.REST.More;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.klef.REST.More.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {
  Product findByPid(String s);
  List<Product> findAllByEmail(String email);
  Product findProductById(String id);
}
