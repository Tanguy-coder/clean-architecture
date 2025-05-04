package com.unchk.Clean_architecture.Domain.Entity;

public class PanierProduct extends AbstractEntity{

    private Panier panier;
    private Product product;
    private Integer qty;

    public PanierProduct() {
    }

    public PanierProduct(Panier panier, Product product, Integer qty) {
        this.panier = panier;
        this.product = product;
        this.qty = qty;
    }

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
