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
public class Myatm implements atm1 {
     Client c;
     public Myatm(Client c){
         this.c= c;
     }

    @Override
    public String getcurrentbalance() {
        return c.getBalance()+"";
    }

    @Override
    public void withdarw(String amount) {
        double x= Double.parseDouble(amount);
        if (c.getBalance()>x){
            double current = c.getBalance();
            c.setBalance(current - x);
        }
    }

    @Override
    public void deposit(String amount) {
        double x =Double.parseDouble(amount);
        if (c.getBalance()>x){
            double current = c.getBalance();
            c.setBalance(current+x);
        }
    }

    @Override
    public String prev() { 
        return null;
    }

    @Override
    public String next() {
        return null;
    }
    
}
