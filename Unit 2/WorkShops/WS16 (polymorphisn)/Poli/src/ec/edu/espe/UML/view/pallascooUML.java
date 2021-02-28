/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UML.view;

import ec.edu.espe.UML.model.A;
import ec.edu.espe.UML.model.B;
import java.util.ArrayList;

/**
 *
 * @author Fernando Pallasco
 */
public class pallascooUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a= new A();
        ArrayList<B> bs = new ArrayList<>();
        
        B b = new B();
        bs.add(b);
        
        System.out.println("a ->  is of type" +a.getClass().getName());
        System.out.println("b -> is of type " +b.getClass().getSimpleName());
        System.out.println("bs -> is of type" +bs.getClass().getSimpleName());
        
        System.out.println("bs size -> " +bs.size());
        
        //(polymorphisn)
        //polymorphisn objects
        
        a= new B();
        System.out.println("a -> is of type" +a.getClass().getName());
        
        //overrided method (A also has a method calles m())
        b.m();
        
        //overloaded methods
        b.m(5.7F);
        b.m(10);
        b.m(7,5);
    }
    
}
