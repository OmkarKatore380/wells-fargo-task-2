package com.wellsfargo.counselor.entity;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long advisorId;
    private String advisorName;
    private String advisorEmail;
    @OneToMany(mappedBy = "advisor")
    private List<Client>client;
    public Advisor(){}
    public Advisor(String advisorName,String advisorEmail){
        this.advisorName=advisorName;
        this.advisorEmail=advisorEmail;
    }
    
    public long getAdvisorId() {
        return advisorId;
    }
    public String getAdvisorName() {
        return advisorName;
    }
    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }
    public String getAdvisorEmail() {
        return advisorEmail;
    }
    public void setAdvisorEmail(String advisorEmail) {
        this.advisorEmail = advisorEmail;
    }

}