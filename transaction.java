/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.ArrayList;

/**
 *
 * @author W
 */
public class transaction {
    double balance;
    ArrayList<String> types =new ArrayList<>(5);
    ArrayList<Double> amounts =new ArrayList<>(5);
    int index =0;
    String type;
    double amount;
    public transaction(){
    double Balance =100;
    }
    public void setTypes(ArrayList<String> types){
        this.types =types;
    }
    public void setAmounts(ArrayList<Double> amounts){
        this.amounts=amounts;
        
    }
    public double getWithdraw(double withdraw){
        balance=balance-withdraw;
        types.add("withdraw");
        amounts.add(withdraw);
        index++; 
        if(amounts.size()>5 && types.size()>5){
            amounts.remove(0);
            types.remove(0);
        } 
        return balance;
    }
    public double deposit(double deposit){
        balance=balance+deposit;
        types.add("deposit");
        index++;
        if(amounts.size()>5 && types.size()>5){
            amounts.remove(0);
            types.add("deposit");
            amounts.add(deposit);
        }
    return balance ;}
     
public double getBalance(){
    return balance;
} 
}
        
        
        
    








        
       
        
        

        

        
        
        
        
        

    
   









    
    

        
    
        
    
    
    
           
    
    

