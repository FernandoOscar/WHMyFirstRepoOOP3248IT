/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.leastcommonmutiple.model;


/**  
 *
 * @author Fernando Pallasco
 */
public class Operation implements IOperation {
    @Override
    public int mcm(int num1, int num2, int num3){
        int i=2;
        int min=1;
        while(i<=num1 || i<= num2 || i<= num3){
            if(num1%i==0 || num2%i==0 || num3%i==0){
                min=min*i;
                if(num1%i==0) num1=num1/i;
                if(num2%i==0) num2=num2/i;
                if(num3%i==0) num3=num3/i;
            }else
                i++;
        }        
        return min;
    }
}
