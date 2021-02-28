/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Group4
 */
public class Polyclinic {

    int virtualid;
    boolean qrcode;
    Scanner vr = new Scanner(System.in);
    String treatment;
    String infection;
    private ArrayList<GeneralMedicine> gMedicines;
    ArrayList<Odontology> Odont;

    public void attendeStudent() throws IOException {

        Scanner ans = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("                      ========================");
        System.out.println("                       WELCOME AT POLYCLINIC");
        System.out.println("                      ========================");

        System.out.println("1) Add new Doctor");
        System.out.println("2) Attend Student");
        System.out.println("3) Exit");
        int option = ans.nextInt();

        switch (option) {

            case 1:
                Doctor doctor = new Doctor();
                doctor.doctorData();
                attendeStudent();
                break;

            case 2:
                attendStudent();
                break;

            case 3:
                System.out.println("Thanks for coming");
                break;

        }

    }

    public void attendStudent() throws IOException {

        Scanner ans = new Scanner(System.in);
        File file1 = new File("DoctorData.csv");
        int option2 = 0;
        System.out.println("Please go to the area you want to be served");
        System.out.println("");
        System.out.println("What are should it be understood?");
        System.out.println("\t1. General Medicine");
        System.out.println("\t2. Odontology");
        System.out.println("\t3. Clinical Laboratory");
        System.out.println(" ");
        option2 = ans.nextInt();

        switch (option2) {
            case 1:

                File file2 = new File("GeneralAttention.json");
                FileWriter write = new FileWriter(file2, true);
                PrintWriter line = new PrintWriter(write);
                System.out.println("----------Doctors available for General medicine");
                String general = "General Medicine";
                System.out.println("============================================");
                Data.find(file1, general);
                System.out.println("============================================");
                ans.nextLine();
                System.out.println("What is the reason for your visit?");
                String reasonConsult = ans.nextLine();

                System.out.println("Prescribe a medicine for the patient!");
                System.out.println(" \n");
                System.out.println("---Available Medicines");
                System.out.println("======================");
                System.out.println("Paracetamol \nOmeprazole \nSimvastatina \nAspirin");
                System.out.println(" ");
                System.out.println(" ");
                Inventory turn1 = new Inventory();
                turn1.medicines();

                ArrayList<GeneralMedicine> prescription = turn1.getgMedicines();

                ClinicHistory shifts = new ClinicHistory(reasonConsult, prescription);

                Gson gson = new Gson();
                String saveData = gson.toJson(shifts);

                for (int i = 0; i < 1; i++) {
                    line.write(saveData);
                    line.write("\n");
                }

                line.close();
                write.close();

                break;

            case 2:

                File file3 = new File("OndontologyAttention.csv");
                FileWriter write1 = new FileWriter(file3, true);
                PrintWriter line1 = new PrintWriter(write1);
                System.out.println("----------Doctors available for Odontology");
                String odonto = "Odontology";
                ans.nextLine();
                System.out.println("============================================");
                Data.find(file1, odonto);
                System.out.println("============================================");
                System.out.println("What is the reason for your visit?");
                treatment = ans.nextLine();

                System.out.println("Did you have an infection?");
                infection = ans.nextLine();

                System.out.println("Available Treatments");
                System.out.println("======================");
                System.out.println("Root canals \nExtraction \nOrthodontics \nProphylaxis");
                System.out.println(" ");
                Inventory turn2 = new Inventory();
                turn2.tools();
                System.out.println("The treatment that the patient had is: " + treatment
                        + "   Infeccion: " + infection);

                String treat = ("The treatment that the patient had is: " + treatment+ 
                            "   Infection: " + infection);
                line1.println(treat);
                line1.close();
                write1.close();
                break;

            case 3:
                System.out.println(" ");
                System.out.println("----------Doctors available for General medicine");
                String clinical = "ClinicalLaboratory";
                System.out.println("============================================");
                Data.find(file1, clinical);
                System.out.println("============================================");
                ans.nextLine();
                System.out.println("Available Samples");
                System.out.println("Hemogram \nUroanalysis \nSARS-CoV-2 COVID19 \nCoproanalysis");
                System.out.println("======================");
                System.out.println(" ");
                Inventory turn3 = new Inventory();
                turn3.samples();
                break;

            default:
                System.out.println("Only numbers between  1 - 3");
                System.out.println(" ");
        }

    }

}
