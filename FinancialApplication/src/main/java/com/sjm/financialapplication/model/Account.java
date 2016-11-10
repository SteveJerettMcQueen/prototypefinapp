package com.sjm.financialapplication.model;
// Generated Jul 26, 2016 6:39:04 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Account generated by hbm2java
 */
public class Account  implements java.io.Serializable {


     private int accountId;
     private String accountName;
     private BigDecimal accountInitBal;
     private BigDecimal accountCurBal;
     private Date startDate;
     private Set accountGoals = new HashSet(0);
     private Set accountTransactions = new HashSet(0);
     private Accountowner accountowner;

    public Account() {
    }

	
    public Account(Date startDate, Accountowner accountowner) {
        this.startDate = startDate;
        this.accountowner = accountowner;
    }
    public Account(String accountName, BigDecimal accountInitBal, BigDecimal accountCurBal, Date startDate, Set accountGoals, Set accountTransactions, Accountowner accountowner) {
       this.accountName = accountName;
       this.accountInitBal = accountInitBal;
       this.accountCurBal = accountCurBal;
       this.startDate = startDate;
       this.accountGoals = accountGoals;
       this.accountTransactions = accountTransactions;
       this.accountowner = accountowner;
    }
   
    public int getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public String getAccountName() {
        return this.accountName;
    }
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public BigDecimal getAccountInitBal() {
        return this.accountInitBal;
    }
    
    public void setAccountInitBal(BigDecimal accountInitBal) {
        this.accountInitBal = accountInitBal;
    }
    public BigDecimal getAccountCurBal() {
        return this.accountCurBal;
    }
    
    public void setAccountCurBal(BigDecimal accountCurBal) {
        this.accountCurBal = accountCurBal;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Set getAccountGoals() {
        return this.accountGoals;
    }
    
    public void setAccountGoals(Set accountGoals) {
        this.accountGoals = accountGoals;
    }
    public Set getAccountTransactions() {
        return this.accountTransactions;
    }
    
    public void setAccountTransactions(Set accountTransactions) {
        this.accountTransactions = accountTransactions;
    }
    public Accountowner getAccountowner() {
        return this.accountowner;
    }
    
    public void setAccountowner(Accountowner accountowner) {
        this.accountowner = accountowner;
    }




}

