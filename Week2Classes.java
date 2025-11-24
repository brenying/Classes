/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2.classes;

/**
 *
 * @author SFU
 */
public class Week2Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account account = new Account(1122, 20000.0);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: "+ account.getDate());
        System.out.println();
        
        newAccount newaccount = new newAccount("George", 1122, 1000.0);
        newaccount.setAnnualInterestRate(1.5);
        newaccount.deposit(30.0);
        newaccount.deposit(40.0);
        newaccount.deposit(50.0);
        newaccount.withdraw(5.0);
        newaccount.withdraw(4.0);
        newaccount.withdraw(2.0);
        System.out.println("Account Summary:");
        System.out.println("Holder Name: "+ newaccount.getName());
        System.out.println("Interest Rate: "+newaccount.getAnnualInterestRate());
        System.out.println("Balance: "+newaccount.getBalance());
        System.out.println("Transactions:");
        
        for (Transaction transaction : newaccount.getTransactions()) {
            System.out.println("Date: " + transaction.getDate() + " Type: "+transaction.getType() + " Amount: " + transaction.getAmount() +" Balance: " + transaction.getBalance() +" " + transaction.getDescription());
        }
    }
    
}
