package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Client {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long clientId;
private String name;
private String phone;
private String email;
@ManyToOne
@JoinColumn(name="advisorId")
private Advisor advisor;
@OneToOne(mappedBy = "client")
private Portfolio portfolio;
public Client(){}
public Client(String name,String phone,String email,Advisor advisor){
    this.name=name;
    this.phone=phone;
    this.email=email;
    this.advisor=advisor;
}

public long getClientId() {
    return clientId;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public Advisor getAdvisor() {
    return advisor;
}
public void setAdvisor(Advisor advisor) {
    this.advisor = advisor;
}

}
