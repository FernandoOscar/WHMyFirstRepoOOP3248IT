/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.calculator.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando Pallasco
 */
public class BasicOperationTest {
    
    public BasicOperationTest() {
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 1F;
        float addend2 = 2F;
        BasicOperation instance = new BasicOperation();
        float expResult = 3.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
     @Test
    public void testAddNegative() {
        System.out.println("add");
        float addend1 = -1.0F;
        float addend2 = -2.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = -3.0F;
        float result = instance.add(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of multiplication method, of class BasicOperation.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        float multiplicand = 0.0F;
        float multiplier = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.multiplication(multiplicand, multiplier);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        float dividen = 0.0F;
        float divisor = 0.0F;
        BasicOperation instance = new BasicOperation();
        float expResult = 0.0F;
        float result = instance.divide(dividen, divisor);
        assertEquals(expResult, result, 0.0);

    }
    
}
