/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.UML.model;

/**
 *
 * @author Fernando Pallasco
 */
public class B extends A{
    C[] c = new C[1];
    
    @Override
    public void m(){
        System.out.println("method m() from B");
    }
    
    //overloading
    public void m(int x){
        System.out.println("second method m() from B with int " + x);
    }
    
    //overloading
    public void m(float f){
        System.out.println("second method m() from B with int " + f);
    }
    
    //overloading
    public void m(int x, int y){
        System.out.println("second method m() from B with int " + x + "and y" + y);
    }
    
    
}
