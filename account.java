/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author W
 */
public class account {
    private double balance;
    public account(double initialBalance){
        if (initialBalance > 0.0) 
        balance=initialBalance;
        
    }
    public void credit(double amount)
    { if (balance>=amount)
        
        balance = balance + amount;
    else 
        System.out.println("Error");
    }
    public void debit(double amount){
        balance = balance - amount ;
    }
    public double getbalance(){
        return balance;
    }
}
