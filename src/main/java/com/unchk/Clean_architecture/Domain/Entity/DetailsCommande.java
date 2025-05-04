package com.unchk.Clean_architecture.Domain.Entity;



public class DetailsCommande extends AbstractEntity{

    private Commande commande;
    private Product product;
    private Integer quantity;

    public DetailsCommande() {
    }

    public DetailsCommande(Commande commande, Product product, Integer quantity) {
        this.commande = commande;
        this.product = product;
        this.quantity = quantity;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
