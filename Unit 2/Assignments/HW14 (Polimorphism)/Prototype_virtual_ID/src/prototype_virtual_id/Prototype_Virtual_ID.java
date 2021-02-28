package prototype_virtual_id;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import ec.edu.espe.simulador.model.Director;
import ec.edu.espe.simulador.model.Student;
import ec.edu.espe.simulador.model.Administrator;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prototype_Virtual_ID {

    public static void main(String[] args) throws IOException {

        System.out.println("\t================================");
        System.out.println("\tWelcome to the Virtual ID System");
        System.out.println("\t================================");

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
        Student student = new Student();

        while (!exit) {

            try {

                System.out.println("1) Login as Student");
                System.out.println("2) Login as Director");
                System.out.println("3) Login as Administrator");
                System.out.println("4) Exit");
                System.out.println("Write one of the options: ");
                option = sn.nextInt();

                switch (option) {

                    case 1:
                        student.menu();
                        System.out.println("\n");
                        break;

                    case 2:
                        File file = new File("Requests.csv");
                        Scanner input = new Scanner(System.in);
                        file.createNewFile();
                        FileWriter write = new FileWriter(file, true);
                        PrintWriter line = new PrintWriter(write);

                        Director director = new Director();
                        Administrator administrator = new Administrator();
                        
                        System.out.println("Method before use polymorphism objects");
                        System.out.println("addRequest is the method of --> " + administrator.getClass());

                        //POLYMORPHISM
                        //Polymorphism objects
                        administrator = new Director();

                        System.out.println("\nDirector --> is of type " + director.getClass().getName());
                        System.out.println("Administrator --> is of type " + administrator.getClass().getName());
                        
                        System.out.println("\nMethod after use polymorphism objects");
                        System.out.println("addRequest is the method of --> " + administrator.getClass());

                        director.addRequest();

                        System.out.println("===========================================================");
                        System.out.println("Your request has been successfully saved!!");
                        System.out.println("This request has to be read and added to the database by the "
                                + "administrator");
                        System.out.println("  BE PATTIENT ;) ");
                        System.out.println("===========================================================");

                        System.out.println(" ");

                        line.print(director.getSaveData());
                        line.close();
                        write.close();
                        break;

                    case 3:

                        Scanner valid = new Scanner(System.in);
                        int answer2;
                        System.out.println("\n\t1) Add to Database");
                        System.out.println("\t2) Create ID");
                        System.out.println("\t3) Exit");
                        answer2 = valid.nextInt();

                        switch (answer2) {

                            case 1:
                                Scanner ans2 = new Scanner(System.in);
                                File file1 = new File("DataBase.json");
                                File file2 = new File("Requests.csv");
                                FileWriter write1 = new FileWriter(file1, true);
                                PrintWriter line1 = new PrintWriter(write1);
                                System.out.println("======================");
                                System.out.println("Search Student Request");
                                System.out.println("======================");
                                Scanner keyboard = new Scanner(System.in);
                                System.out.print("Write the request to search in the file: ");
                                String data = keyboard.nextLine();
                                System.out.println("============================================================================");
                                Data.find(file2, data);
                                System.out.println("============================================================================");
                                System.out.println("The data to be entered now will be stored in the "
                                        + "database, please be careful.");

                                Administrator admin = new Administrator();
                                admin.addRequest();

                                System.out.println("CONGRATULATIONS, NOW YOU CAN ACCESS THE "
                                        + "SERVICES AND BENEFITS OFFERED BY THE UNIVERSITY!!");

                                line1.close();
                                write1.close();
                                break;

                            case 2:
                                int random;
                                int codeID[] = new int[8];
                                for (int i = 0; i < 8; i++) {
                                    random = (int) (Math.random() * 9);
                                    codeID[i] = random;
                                }
                                System.out.println("\n");
                                System.out.print("Su ID es -> ");

                                for (int i = 0; i < 8; i++) {
                                    System.out.print(codeID[i]);
                                }
                                System.out.println("\n");

                                break;

                            default:
                                System.out.println("Only numbers between  1 - 2");
                                System.out.println(" ");
                        }

                        break;

                    case 4:
                        System.out.println("Thanks!!!");
                        exit = true;
                        System.out.println(" ");
                        System.out.println(" ");
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
}
