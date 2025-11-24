/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.classes;

import java.util.Date;

/**
 *
 * @author SFU
 */
public class Account {
    private Integer id = 0;
    private Double balance = 0.0;
    private Double annualInterestRate = 0.0;
    private Date date;
    
    public Integer getId() {return id;}
    public Double getBalance() {return balance;}
    public Double getAnnualInterestRate() {return annualInterestRate;}
    public Double getMonthlyInterestRate() {return (annualInterestRate / 100) / 12;}
    public Double getMonthlyInterest() {return balance*((annualInterestRate / 100) / 12);}
    public Date getDate() { return date; }
    
    public void setId(Integer i) {id = i;}
    public void setBalance(Double b) {balance = b;}
    public void setAnnualInterestRate(Double a) {annualInterestRate = a;}
    public void withdraw(Double w) {balance = balance - w;}
    public void deposit(Double d) {balance = balance + d;}
    
    public Account() {}  
    public Account(Integer i, Double b) { 
        id = i;
        balance = b;
        date = new Date();
    }
    
    
}
