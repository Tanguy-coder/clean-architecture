package com.unchk.Clean_architecture.Domain.Entity;



import java.util.List;

public class Panier extends AbstractEntity{
    private User user;
    private List<Product> products;
    private Integer qty;

    public Panier() {
    }

    public Panier(User user, List<Product> products, Integer qty) {
        this.user = user;
        this.products = products;
        this.qty = qty;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
