/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.calculator.model;

/**
 *
 * @author Fernando Pallasco
 */
public class BasicOperation implements IBasicOperation {

    @Override
    public float add(float addend1, float addend2) {
        float sum;
        sum= addend1 + addend2;
        return sum;
    }

    @Override
    public float multiplication(float multiplicand, float multiplier) {
        return 0.0F;
    }

    @Override
    public float divide(float dividen, float divisor) {
        return 0.0F;
    }
    
}
