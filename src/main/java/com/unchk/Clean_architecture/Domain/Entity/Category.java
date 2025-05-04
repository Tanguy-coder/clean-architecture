package com.unchk.Clean_architecture.Domain.Entity;


import java.util.List;

public class Category extends AbstractEntity{
    private  String name;
    private  String Image;
    private List<Product> products;

    public Category() {
    }

    public Category(String name, String image, List<Product> products) {
        this.name = name;
        Image = image;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
