package com.wellsfargo.counselor.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Portfolio {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long portfolioId;
private String portfolioName;
@OneToOne
@JoinColumn(name="clientId")
private Client client;
@OneToMany(mappedBy = "portfolio")
private List<Holding>holding;
public Portfolio(){}
public Portfolio(String portfolioName,Client client){
    this.portfolioName=portfolioName;
    this.client=client;
}

public long getPortfolioId() {
    return portfolioId;
}
public String getPortfolioName() {
    return portfolioName;
}
public void setPortfolioName(String portfolioName) {
    this.portfolioName = portfolioName;
}
public Client getClient() {
    return client;
}
public void setClient(Client client) {
    this.client = client;
}

}
