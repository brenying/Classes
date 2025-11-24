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
public class Transaction {
    private char type;
    private Double amount;
    private Double balance;
    private String description;
    private Date date;
    
            
    public char getType() {return type;}
    public Double getAmount() {return amount;}
    public Double getBalance() {return balance;}
    public String getDescription() {return description;}
    public Date getDate() { return date; }
    
    public void setType(char t) {type = t;} 
    public void setAmount(Double a) {amount = a;}
    public void setBalance(Double b) {balance = b;}
    public void setDescription(String d) {description = d;}
    public void setTransaction(char t, Double a, Double b, String d) {setType(t); setAmount(a); setBalance(b); setDescription(d);}
    
    public Transaction(char t, Double a, Double b, String d) {
        type = t;
        amount = a;
        balance = b;
        description = d;
        date = new Date();
    }
}
