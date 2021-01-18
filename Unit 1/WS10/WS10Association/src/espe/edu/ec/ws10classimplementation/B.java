/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.ws10classimplementation;

/**
 *
 * @author Fernando Pallasco
 */
public class B {

    private int a;
    private int b;
    private E[] es = new E[5];

    public C m1(F f) {
        System.out.println("inside C.m1(F f)");
        return new C();
    }

    @Override
    public String toString() {
        return "B{" + "a=" + a + ", b=" + b + ", es=" + es + '}';
    }

    public B(int a, int b, E[] es) {
        this.a = a;
        this.b = b;
        this.es = es;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the es
     */
    public E[] getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(E[] es) {
        this.es = es;
    }
}
