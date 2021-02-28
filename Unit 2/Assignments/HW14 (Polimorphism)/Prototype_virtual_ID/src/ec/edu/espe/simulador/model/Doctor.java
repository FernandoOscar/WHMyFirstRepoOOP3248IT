/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Doctor {
    
    String name;
    String area;
    String schedule;
    
    public void doctorData() {

        Scanner input = new Scanner(System.in);
        File file = new File("DoctorData.csv");
        System.out.println("Do you want to add a new doctor to the polyclinic?");
        System.out.println("Yes(Y) or No(N): ");
        char answer1 = input.next().charAt(0);
        input.nextLine();

        if (answer1 == 'Y' || answer1 == 'y') {
            try {
                System.out.println("Please enter your data");
                file.createNewFile();
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);

                System.out.print("Enter your name: ");
                name = input.nextLine();
                System.out.print("Enter your area: ");
                area = input.nextLine();
                System.out.print("Enter your schedule: ");
                schedule = input.nextLine();
               
                String dataToSave = (name + "," + area + "," + schedule + ",");

                line.println(dataToSave);
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (answer1 == 'N' || answer1 == 'n') {
            System.out.println("Ok!");
            System.out.println(" ");
        }
    }
}