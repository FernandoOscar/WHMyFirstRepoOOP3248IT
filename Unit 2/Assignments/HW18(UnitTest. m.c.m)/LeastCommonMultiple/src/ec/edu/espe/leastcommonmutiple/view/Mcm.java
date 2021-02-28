/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.leastcommonmutiple.view;

import ec.edu.espe.leastcommonmutiple.model.Operation;
import java.util.Scanner;

/**
 *
 * @author Fernando Pallasco
 */
public class Mcm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, res;
        System.out.println("Enter the first number: ");
        number1 = input.nextInt();
        input.nextLine();
        System.out.println("Enter the second number: ");
        number2 = input.nextInt();
        input.nextLine();
        System.out.println("Enter the third number: ");
        number3 = input.nextInt();
        input.nextLine();
        Operation lcm = new Operation();
        res= lcm.mcm(number1, number2, number3);

        System.out.println("The lcm is " + res);
    }
}
