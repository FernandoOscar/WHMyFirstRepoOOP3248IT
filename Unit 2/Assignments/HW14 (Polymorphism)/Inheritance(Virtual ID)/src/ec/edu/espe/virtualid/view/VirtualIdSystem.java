/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualid.view;

import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.virtualid.model.Doctor;
import ec.edu.espe.virtualid.model.Person;
import ec.edu.espe.virtualid.model.Student;
import ec.edu.espe.virtualid.model.Director;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author FErnando Pallasco
 */
public class VirtualIdSystem {

    public static void main(String[] args) {

        Student student = new Student("bapazmino3", 995593932, "M", "Bryan Pazmino", 383538, 23);
        System.out.println("student -> " + student);

        Director director = new Director("TI", "Software", "Male", "Ramiro Delgado", 183984554, 55);
        System.out.println("director -> " + director);

        Doctor doctor = new Doctor("Odontology", "M", "Viviana Gordon", 849345, 40);
        System.out.println("doctor -> " + doctor);

        //POLYMORPHISM
        System.out.println("\nPOLYMORPHISM");
        Person person1 = new Student("bapazmino3", 995593932, "M", "Bryan Pazmino", 354835, 23);
        System.out.println("person1 --> " + person1.showData());

        Person person2 = new Doctor("GeneralMedicine", "M", "Ivan Beltran", 345734, 40);
        System.out.println("person2 --> " + person2.showData());

        Person person3 = new Director("TI", "Computer Science", "M", "Edison Lascano", 874934, 50);
        System.out.println("person3 --> " + person3.showData());

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {

            try {

                System.out.println("\n Verify Identification Of Directors");
                System.out.println("1) With UserName");
                System.out.println("2) With Code");
                System.out.println("3) Exit");
                System.out.println("Write one of the options: ");
                option = sn.nextInt();

                switch (option) {

                    case 1:
                        verifyUser();
                        break;

                    case 2:
                        verifyCode();
                        break;

                    case 3:
                        System.out.println("Thanks!");
                        break;

                    default:
                        System.out.println("Only numbers between  1 - 3");
                        System.out.println(" ");

                }
            } catch (InputMismatchException e) {
                System.out.println("You must insert a number!!");
                System.out.println(" ");
                sn.next();
            }
        }
    }

    public static void verifyUser() {
        Scanner sn = new Scanner(System.in);
        String name;
        System.out.println("Enter user: ");
        name = sn.nextLine();
        Director director = new Director(name);
        director.verifyDirector(name);

        if (director.verifyDirector(name) == false) {
            System.out.println("You are not a Director");
        } else {
            System.out.println("Welcome Again");
        }
    }

    public static void verifyCode() {
        Scanner sn = new Scanner(System.in);
        int password;
        System.out.println("Enter code: ");
        password = sn.nextInt();
        Director director = new Director(password);
        director.verifyDirector(password);
        System.out.println(director.verifyDirector(password));
        if (director.verifyDirector(password)== false) {
            System.out.println("You are not a Director");
        } else {
            System.out.println("Welcome Again");
        }

    }

}
