package com.klef.REST.More;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klef.REST.More.*;


@RestController
@RequestMapping("/product")
//@CrossOrigin(origins = "http://localhost:3000/")
@CrossOrigin("https://dealsblendr.netlify.app")
public class ProductController {
  
  @Autowired
  ProductServiceImpl pr;
  
  @GetMapping("/all")
  public ResponseEntity<List<Product>> allProducts()
  {
    List<Product> al = pr.allProducts();
    return new ResponseEntity<List<Product>>(al,HttpStatus.OK);
  }
  
  @GetMapping("/one/{pid}")
  public ResponseEntity<Product> getOneProduct(@PathVariable String pid)
  {
    Product p = pr.findOneProduct(pid);
    return new ResponseEntity<Product>(p,HttpStatus.OK);
  }
  
  @PostMapping("/save")
  public ResponseEntity<String> insertData(@RequestBody Product p)
  {
    String id = pr.insertProduct(p);
    return new ResponseEntity<String>("User "+id+" | saved",HttpStatus.OK);
  }
  
  @GetMapping("/email/{email}")
  public ResponseEntity<List<Product>> allProducts(@PathVariable String email)
  {
    List<Product> al = pr.findAllByEmail(email);
    System.out.println("Heello");
    return new ResponseEntity<List<Product>>(al,HttpStatus.OK);
  }
  
  @DeleteMapping("/delete/{pid}")
  public ResponseEntity<String> deleteProduct(@PathVariable String pid)
  {
    pr.deleteProduct(pid);
    return new ResponseEntity<String>("Deleted Success fully",HttpStatus.OK);
  }
  @DeleteMapping("/del/{id}")
  public ResponseEntity<String> deleteProductById(@PathVariable String id)
  {
    pr.deleteProductByid(id);
    return new ResponseEntity<String>("Deleted "+id+" Successfully",HttpStatus.OK);
  }
}
