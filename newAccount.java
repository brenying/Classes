/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.classes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SFU
 */
public class newAccount {
    private String name;
    private Integer id = 0;
    private Double balance = 0.0;
    private Double annualInterestRate = 0.0;
    private ArrayList<Transaction> transactions;
    private Date dateCreated;
;
    
    public String getName() {return name;}
    public Integer getId() {return id;}
    public Double getBalance() {return balance;}
    public Double getAnnualInterestRate() {return annualInterestRate;}
    public Double getMonthlyInterestRate() {return (annualInterestRate / 100) / 12;}
    public Double getMonthlyInterest() {return balance*((annualInterestRate / 100) / 12);}
    public ArrayList<Transaction> getTransactions() {return transactions;}
    
    public void setName(String n) {name = n;}
    public void setId(Integer i) {id = i;}
    public void setBalance(Double b) {balance = b;}
    public void setAnnualInterestRate(Double a) {annualInterestRate = a;}
    public void withdraw(Double w) {
        balance -= w;
        transactions.add(new Transaction('W', w, balance, "Withdrawal"));
    }
    public void deposit(Double d) {
        balance += d;
        transactions.add(new Transaction('D', d, balance, "Deposit"));
    }
    
    public newAccount() {
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }
   public newAccount(String n, Integer i, Double b) {
        name = n;
        id = i;
        balance = b;
        annualInterestRate = 0.0;
        dateCreated = new Date();
        transactions = new ArrayList<>(); 
    }
}
