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
public interface IBasicOperation {
    float add(float addend1, float addend2);
    float multiplication(float multiplicand, float multiplier);
    float divide(float dividen, float divisor);
}
