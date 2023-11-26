package com.klef.REST.More;

import java.util.List;

import com.klef.REST.More.*;

public interface IProductService {
  public List<Product> allProducts();
  public Product findOneProduct(String s);
  public String insertProduct(Product p);
  public List<Product> findAllByEmail(String email);
  public void deleteProduct(String pid);
  public void deleteProductByid(String id);
}