/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MedicalCheck {

    String date;
    String time;

    public void addAppointment() throws IOException {

        File file = new File("MedicalCheck.json");
        Scanner as = new Scanner(System.in);
        Scanner mc = new Scanner(System.in);
        FileWriter write = new FileWriter(file, true);
        PrintWriter line = new PrintWriter(write);
        System.out.println("\t\tDo you want to make an appointment? (A)");
        System.out.println("\t\tDo you need immediate attention? (N)");
        System.out.println("\t\tAppoinment(A) or Now(N)");
        char elect = as.next().charAt(0);
        as.nextLine();

        if (elect == 'A' || elect == 'a') {

            try {
                file.createNewFile();
                System.out.println(" ");
                System.out.println("For what day do you need the appointment?");
                System.out.println("Enter date in format dd/mm/yyyy: ");
                date = mc.nextLine();
                System.out.println("What time do you need the appointment?");
                System.out.println("Enter time in format hh:mm: ");
                time = mc.nextLine();

                MedicalCheck check = new MedicalCheck(date, time);
                String appo = ("Appointment scheduled for " + date + " at " + time + " hours");
                System.out.println(appo);
                System.out.println("=====================================");
                System.out.println(" ");

                Gson gson = new Gson();
                String saveData = gson.toJson(check);
                

                for (int i = 0; i < 1; i++) {
                    line.write(saveData);
                    line.write("\n");
                }
                
                
                line.close();
                write.close();
            } catch (IOException e) {
                System.out.println("Error");
            }

        }
        if (elect == 'N' || elect == 'n') {
            Polyclinic poly = new Polyclinic();
            poly.attendeStudent();
        }
    }

    public MedicalCheck(String date, String time) {
        this.date = date;
        this.time = time;
    }

    public MedicalCheck() {
    }

    
}
