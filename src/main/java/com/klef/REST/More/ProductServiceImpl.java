package com.klef.REST.More;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.REST.More.Product;
import com.klef.REST.Signup_entity;
import com.klef.REST.More.ProductRepository;


@Service
public class ProductServiceImpl implements IProductService{
  
  @Autowired
  ProductRepository pr;

  public ProductServiceImpl(ProductRepository pr) {
	 
	  this.pr = pr;
  }
  @Override
  public List<Product> allProducts() {
    List<Product> products = pr.findAll(); 
    return products;
  }

  @Override
  public Product findOneProduct(String s) {
    Product p = pr.findByPid(s);
    return p;
  }

  @Override
  public String insertProduct(Product p) {
    // TODO Auto-generated method stub
    String id = pr.save(p).getId();
    return id;
  }


@Override
  public List<Product> findAllByEmail(String email) {
    List<Product> al = pr.findAllByEmail(email);
    return al;
  }

  @Override
  public void deleteProduct(String pid) {
    Product p = pr.findByPid(pid);
//    System.out.println(p);
    pr.delete(p);
  }

  @Override
  public void deleteProductByid(String id) {
    Product p = pr.findProductById(id);
    pr.delete(p);
  }
}