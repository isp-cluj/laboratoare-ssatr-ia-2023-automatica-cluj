/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssatr.lab1.exercise1;

/**
 *
 * @author mihai
 */

public class Product {
    private String productId;
    private ProductCategory productCategory;
    private Customer customer;
    private int price;

    public Product(String productId, ProductCategory productCategory, Customer customer) {
        this.productId = productId;
        this.productCategory = productCategory;
        this.customer = customer;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    

    //ALT+INSERT
    
    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productCategory=" + productCategory + '}';
    }



}
