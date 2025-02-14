package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Porfolio {

    @Id
    @GeneratedValue()
    private long porfolioId;

    @Column(nullable = false)
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name="clientId",nullable = false)
    private Client client;

    protected Porfolio() {

    }

    public Porfolio(LocalDate creationDate, Client client) {
        this.creationDate = creationDate;
        this.client = client;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getPorfolioId() {
        return porfolioId;
    }


}
