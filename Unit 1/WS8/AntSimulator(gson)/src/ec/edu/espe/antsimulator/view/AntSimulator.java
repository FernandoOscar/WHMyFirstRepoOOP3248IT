/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.Ant;
import ec.edu.espe.antsimulator.model.Food;

/**
 *
 * @author Fernando Pallasco
 */
public class AntSimulator {
    
    public static void main(String[] args){
        Food food;
        food =new Food(1);
        
        System.out.println("food --> " + food);
        Ant ant1 = new Ant(0, "Lucy", "black", 1, true);
        Ant ant2 = new Ant(1); 
        
    }
}
