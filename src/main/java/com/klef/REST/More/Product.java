package com.klef.REST.More;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {
  
  @Id

  String id;
  
  String pid;
  
  String name;
  
  String url;
  
  long price;
  
  String email;
  
  String category;
  
  public Product(){
    
  }

  public Product(String id, String pid, String name, String url, long price, String email, String category) {
    super();
    this.id = id;
    this.pid = pid;
    this.name = name;
    this.url = url;
    this.price = price;
    this.email = email;
    this.category = category;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  
}
