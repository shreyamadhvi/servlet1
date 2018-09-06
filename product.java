/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shreya_servlet1;

/**
 *
 * @author Admin
 */
public class product {
    String product;
    String productdescription;
    Integer productprice;
    String producttype;
    String city;
    String []size;

    public product() {
    }

    public product(String product, String productdescription, Integer productprice, String producttype, String city, String[] size) {
        this.product = product;
        this.productdescription = productdescription;
        this.productprice = productprice;
        this.producttype = producttype;
        this.city = city;
        this.size = size;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public Integer getProductprice() {
        return productprice;
    }

    public void setProductprice(Integer productprice) {
        this.productprice = productprice;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "product{" + "product=" + product + ", productdescription=" + productdescription + ", productprice=" + productprice + ", producttype=" + producttype + ", city=" + city + ", size=" + size + '}';
    }
    
    
    
}
