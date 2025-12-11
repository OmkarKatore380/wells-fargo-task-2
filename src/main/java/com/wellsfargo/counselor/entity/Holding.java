package com.wellsfargo.counselor.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Holding {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long holdingId;
@ManyToOne
@JoinColumn(name="portfolioId")
private Portfolio portfolio;
@ManyToOne
@JoinColumn(name="securityId")
private Security security;
private LocalDate purchaseDate;
private double purchasePrice;
private int quantity;
public Holding(){}
public Holding(Portfolio portfolio,Security security,
    LocalDate purchaseDate,double purchasePrice,int quantity){
        this.portfolio=portfolio;
        this.security=security;
        this.purchaseDate=purchaseDate;
        this.purchasePrice=purchasePrice;
        this.quantity=quantity;
    }
public Portfolio getPortfolio() {
    return portfolio;
}
public void setPortfolio(Portfolio portfolio) {
    this.portfolio = portfolio;
}
public Security getSecurity() {
    return security;
}
public void setSecurity(Security security) {
    this.security = security;
}
public LocalDate getPurchaseDate() {
    return purchaseDate;
}
public void setPurchaseDate(LocalDate purchaseDate) {
    this.purchaseDate = purchaseDate;
}
public double getPurchasePrice() {
    return purchasePrice;
}
public void setPurchasePrice(double purchasePrice) {
    this.purchasePrice = purchasePrice;
}
public int getQuantity() {
    return quantity;
}
public void setQuantity(int quantity) {
    this.quantity = quantity;
}
public long getHoldingId() {
    return holdingId;
}
    
}
