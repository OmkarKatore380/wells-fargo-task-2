package com.wellsfargo.counselor.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Security {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long securityId;
private String securityName;
private String category;
@OneToMany(mappedBy = "security")
private List<Holding>holding;
public Security(String securityName,String category){
    this.securityName=securityName;
    this.category=category;
}

public long getSecurityId() {
    return securityId;
}

public String getSecurityName() {
    return securityName;
}
public void setSecurityName(String securityName) {
    this.securityName = securityName;
}
public String getCategory() {
    return category;
}
public void setCategory(String category) {
    this.category = category;
}

}
