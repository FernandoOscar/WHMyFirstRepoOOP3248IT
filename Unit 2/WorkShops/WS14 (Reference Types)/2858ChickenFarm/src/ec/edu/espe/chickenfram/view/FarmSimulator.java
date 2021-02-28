/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chickenfram.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfram.model.Chicken;
import ec.edu.espe.chickenfram.model.Egg;
import java.util.ArrayList;
import java.util.List;


/*
/**
 *
 * @author Fernando Pallasco
 */


public class FarmSimulator {
    public static void main(String[] args) {

        Chicken chicken = new Chicken(0, "Lucy", "black", 1, true);
        int age=5;
        Integer ageInteger = new Integer(8); 
        
        System.out.println("age before calling the method -> "+ age);// 5
        changeInt(age);
        System.out.println("age before calling the method -> "+ age);// 5?
        System.out.println("\n================\n");
        
        System.out.println("ageInterger before calling the method ->" +ageInteger); //8
        changeInt(age);
        System.out.println("ageInterger before calling the method ->" +ageInteger); // 8? or 10?
        System.out.println("\n================\n");
        
        System.out.println("chicken before calling the method -> "+chicken);//lucy
        changeChicken(chicken);
        System.out.println("chicken before calling the method -> "+chicken);//Maruja
    }
    
    public static void changeInt(int ageParameter){
        int localAge=7;
        System.out.println("ageParameter (inside method changeInt (before change) -> ) " +ageParameter);
        ageParameter= localAge;
        System.out.println("ageParameter (inside method changeInt (before change) -> ) " +ageParameter);
        
    }
    
    public static void changeInteger(Integer ageIntegerParameter){
        Integer localAgeInteger = 10;
        System.out.println("ageIntegerParameter inside the method (before changing) ->" +ageIntegerParameter);
        //ageIntegerParameter = new Integer(localAgeInteger);
        System.out.println("ageIntegerParameter inside the method (before changing) ->" +ageIntegerParameter);
}
    public static void changeChicken(Chicken ch){
        Chicken localChicken= new Chicken(5, "Maruja", "black", 0, false);
        System.out.println("ch parameter before changing" + ch);
        ch.setAge(localChicken.getAge());
        ch.setName(localChicken.getName());
        System.out.println("ch parameter before changing" + ch);
    }
}


