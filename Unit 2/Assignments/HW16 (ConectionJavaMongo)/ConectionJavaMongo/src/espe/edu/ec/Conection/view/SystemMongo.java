/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.Conection.view;

import espe.edu.ec.Conection.model.Conection;
import java.sql.Connection;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SystemMongo {

    public static void main(String[] args) {
        Conection conection = new Conection();
        Scanner data = new Scanner(System.in);
        String id;
        System.out.println("connect to database successfully");
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {

            try {

                System.out.println("\n CRUD");
                System.out.println("1) create");
                System.out.println("2) read");
                System.out.println("3) update");
                System.out.println("4) dalete");
                System.out.println("5) Exit");
                System.out.println("Write one of the options: ");
                option = sn.nextInt();
                

                switch (option) {

                    case 1:
                        System.out.println("\t **Data Entry**");
                        System.out.println("Enter your id: ");
                        id = data.nextLine();
                        conection.create(id);
                       
                        break;

                    case 2:
                        System.out.println("\t**Show Data**");
                        conection.read();
                        break;
                        
                    case 3:
                        String oldId;
                        String newId;
                        System.out.println("\t**Update data**");
                        System.out.println("Enter the old id:");
                        oldId = data.nextLine();
                        System.out.println("Enter the new id: ");
                        newId= data.nextLine();
                        conection.update(oldId, newId);
                        conection.read();
                        break;
                        
                    case 4:
                        System.out.println("\t**Delete Data**");
                        String deleteData;
                        System.out.println("Enter the data that you want to delete: ");
                        deleteData = data.nextLine();
                        conection.delete(deleteData);
                        conection.read();
                        break;
                        
                    case 5:
                        System.out.println("Thanks!");
                        break;

                    default:
                        System.out.println("Only numbers between  1 - 5");
                        System.out.println(" ");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must insert a number!!");
                System.out.println(" ");
                sn.next();
            }
        }

    }
}
