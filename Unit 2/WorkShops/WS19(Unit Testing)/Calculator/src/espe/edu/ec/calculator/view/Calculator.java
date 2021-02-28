/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.calculator.view;

import espe.edu.ec.calculator.model.BasicOperation;
import espe.edu.ec.calculator.model.IBasicOperation;

/**
 *
 * @author Fernando Pallasco
 */
public class Calculator {
    public static void main(String[] args){
        float operand1;
        float operand2;
        float result;
        
        operand1= 3.2f;
        operand2= 1.4f;
        
        IBasicOperation basicOperation;
        basicOperation = new BasicOperation();
        
        result= basicOperation.add(operand1,operand2);
        System.out.println("result " +result);
    }
}
