/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model2;

/**
 *
 * @author Fernando Pallasco
 */
public class Food {
    private int amount;

    @Override
    public String toString() {
        return "Food{" + "amount=" + amount + '}';
    }
    
    

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}