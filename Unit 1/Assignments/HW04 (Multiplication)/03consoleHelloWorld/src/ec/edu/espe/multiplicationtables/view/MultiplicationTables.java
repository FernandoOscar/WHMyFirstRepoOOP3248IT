/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.multiplicationtables.view;

/**
 *
 * @author Fernando Pallasco
 */
public class MultiplicationTables {
    public static void main(String[] args) {
        int result=0;
        for(int i=1;i<=12;i++){
            System.out.println("\nMultiplication Table for number "+i);
            System.out.println("**********************************");
            for(int j=1;j<=10;j++){
                result = i*i;
                System.out.println(i+" X "+j+" = "+(i*j));
            }
        }
    }
    
}
