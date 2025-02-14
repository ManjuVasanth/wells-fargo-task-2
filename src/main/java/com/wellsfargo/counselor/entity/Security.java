package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {



    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name="portfolioId",nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private long quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio,String name, String lastName, String category, long purchasePrice, LocalDate purchaseDate, long quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.lastName = lastName;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }
    public long getSecurityId() {
        return securityId;
    }
    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
