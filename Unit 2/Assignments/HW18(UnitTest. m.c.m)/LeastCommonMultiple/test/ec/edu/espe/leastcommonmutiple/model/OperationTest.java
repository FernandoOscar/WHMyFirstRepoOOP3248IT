/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.leastcommonmutiple.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando Pallasco
 */
public class OperationTest {
    
    public OperationTest() {
    }
    @Test
    public void testMcm() {
        System.out.println("lcm");
        int num1 = 28;
        int num2 = 4;
        int num3 = 16;
        Operation instance = new Operation();
        int expResult = 112;
        int result = instance.mcm(num1, num2, num3);
        assertEquals(expResult, result);

    }
    
}
