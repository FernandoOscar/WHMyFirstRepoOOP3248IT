/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws10associations;

import espe.edu.ec.ws10classimplementation.A;
import espe.edu.ec.ws10classimplementation.B;
import espe.edu.ec.ws10classimplementation.C;
import espe.edu.ec.ws10classimplementation.E;
import java.util.ArrayList;

/**
 *
 * @author Fernando Pallasco
 */
public class WS10Associations {
    public static void main(String[] args) {
        // DONE
        
        E[] es = new E[5];
        B b = new B(0, 0,es);
        ArrayList<C> cs = new ArrayList<>();
        
        A a = new A(b, cs);
        System.out.println("object of type A -> " + a);
        a.m();
        
    }
}
