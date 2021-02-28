/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chickenfram.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfram.model.Chicken;
import ec.edu.espe.chickenfram.model.Egg;


/*
/**
 *
 * @author Fernando Pallasco
 */


public class FarmSimulator {
    public static void main(String[] args) {

        Egg egg;
        egg = new Egg(1);

        System.out.println("egg -> " + egg);

        Chicken chicken = new Chicken(0, "Lucy", "white", 1, true);
        Chicken chicken2 = new Chicken(1, "Mary", "black", 2, false);

        Chicken[] chickens;
        chickens = new Chicken[3];

        int[] numbers = {3, 8, 89, 23};
        String[] toys = {"car", "lego", "doll", "ball", "robot", "gun", "pool"};

        System.out.println("toys size --> " + toys.length);

        System.out.println("numbers size -> " + numbers.length);

        try {
            System.out.println("numbers[5] -> " + numbers[4]);
        } catch (Exception ex) {
            /*System.out.println("Exception -> " + ex.getMessage());
            System.out.println(ex.toString());
            System.out.println(ex.getStackTrace());*/
            System.out.println("no puede leer mas de cuatro elementos");
        }

        for (int i = 0; i < toys.length; i++) {
            System.out.println("toy[" + (i + 1) + "] -> " + toys[i]);
        }

        toys[1] = "legos";
        for (String toy : toys) {
            System.out.println("toy -> " + toy);
        }

        for (int number : numbers) {
            number = number * 10;
            System.out.println(number);
        }

        int size;
        size = 10;

        int[] grades = new int[size];

        System.out.println("chickens --> " + chickens[0]);
        System.out.println("chickens --> " + chickens[1]);
        System.out.println("chickens --> " + chickens[2]);

        for (int i = 0; i < chickens.length; i++) {
            chickens[i] = new Chicken(i, "name" + i, "white", 0, true);
        }

        int counter = 0;
        for (Chicken ch : chickens) {
            System.out.println("chicken (" + (++counter) + ") -> " + ch);
        }

        System.out.println("{ \"firstName\":\"John\", \"lastName\":\"Doe\" }");

        //library : GSON
        Gson gson = new Gson();
        String jsonChicken;

        //serialization
        jsonChicken = gson.toJson(chicken);

        System.out.println("chicken  in json format -> " + jsonChicken);

        jsonChicken = gson.toJson(chicken2);

        System.out.println("chicken  in json format -> " + jsonChicken);

        //deserialization
        
        String jsonCh= "{\"id\":5,\"name\":\"Pepita\",\"color\":\"black\","
                + "\"age\":3,\"isMolting\":false}";


        Chicken chicken3;
        chicken3 = gson.fromJson(jsonCh, Chicken.class);
        
        System.out.println("chicken 3 -> " + chicken3);
        
        //deserialization
        //System.out.println("chicken (0) -> " + chickens[0]);
        //System.out.println("chicken (0) -> " + chickens[1]);
        /*
        try {
            System.out.println("chicken (0) -> " + chickens[10]);
        } catch (Exception ex) {
            System.out.println("Oiga, no acepta mas de 5 pollitos");
        }
         */
        
        
    }
}


