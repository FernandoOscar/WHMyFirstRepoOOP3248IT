package espe.edu.ec.dataType.group2;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.Data;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Group2
 */

public class PeopleData {
    
    
    public static void main(String[] args) throws InterruptedException {
        
        

        
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option; 
           
        while(!exit){
           
           System.out.println("1. Save Data");
           System.out.println("2. Find Data");          
           System.out.println("3. Exit");
           
           try{
           
           System.out.println("Write one of the options: ");
           option = sn.nextInt();

           switch(option){
               
               case 1:
   
                   try{
                       DataOut();
                       
                       
                   }catch(Exception ex){
                       
                   }
                          
                   break;
                   
               case 2:
                   File file = new File("Group2.csv");
                   Scanner keyboard = new Scanner(System.in);
                   System.out.println(" ");
                   System.out.print("Write the word to search in the file: ");
                   String data = keyboard.nextLine();
                   //System.out.println("Size ---> "+data.length());
                   Data.find(file, "\"" + data + "\"");
                   
                   /*try{
                       Reader myReader = Files.newBufferedReader(Paths.get("Group2.csv"));
                       Gson gson = new Gson();
                       Map<?,?> userMap = gson.fromJson(myReader, Map.class);
                       System.out.println(userMap.get("name"));
                       
                       
                       
                   }catch(IOException e){
                   }*/
                   

                   //Data.find(file, data);
                   System.out.println(" ");


                   break;
                   
               case 3:
                   System.out.println("Thanks!!!");
                   exit=true;
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

public static void DataOut(){
            
           
            Scanner input = new Scanner(System.in);
            File file = new File("Group2.csv");
                        
            if (!file.exists()) {          
                try {                              
                    file.createNewFile();
                    FileWriter write = new FileWriter(file, true);
                    PrintWriter line = new PrintWriter(write);
                    System.out.print("Enter your name: ");
                    String name = input.nextLine();
                    System.out.print("Enter your age: ");
                    int age = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter your telephone: ");
                    String telephone = input.nextLine();
                    System.out.print("Enter your subject: ");
                    String subject = input.nextLine();
                    System.out.print("Enter your average: ");
                    float average = input.nextFloat();
                    System.out.print("Enter your gender Male(M) or Female(F):  ");
                    char gender = input.next().charAt(0);                    
                    InformationData information = new InformationData(age, name, subject, telephone, average, gender);
                    
                    Gson gson = new Gson();
                    String saveData = gson.toJson(information);
                                                     
                    for (int i = 0; i < 1; i++) {
                        line.write(saveData);
                        line.write("\n");
                    }
                    
                    //Data.save("Group2.csv", saveData);
                    
                    
                    //line.print(saveData);
                    //saveData = "{\"age\":+age}";
                    
                    
                    information = gson.fromJson(saveData, InformationData.class);
                    System.out.println(information);
                    System.out.println(" ");
                    
                    line.close();
                    write.close();           

                }catch (IOException ex) {
                    
                }
            
            } else {
                try {
                    FileWriter write = new FileWriter(file, true);
                    PrintWriter line = new PrintWriter(write);
                    System.out.print("Enter your name: ");
                    String name = input.nextLine();
                    System.out.print("Enter your age: ");
                    int age = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter your telephone: ");
                    String telephone = input.nextLine();
                    System.out.print("Enter your subject: ");
                    String subject = input.nextLine();
                    System.out.print("Enter your average: ");
                    float average = input.nextFloat();
                    System.out.print("Enter your gender Male(M) or Female(F):  ");
                    char gender = input.next().charAt(0);                    
                    InformationData information = new InformationData(age, name, subject, telephone, average, gender);
                    
                    Gson gson = new Gson();
                    String saveData = gson.toJson(information);
                                                     
                    for (int i = 0; i < 1; i++) {
                        line.write(saveData);
                        line.write("\n");
                    }
                    
                    //Data.save("Group2.csv", saveData);
                    
                    
                    //line.print(saveData);
                    //saveData = "{\"age\":+age}";
                    
                    
                    information = gson.fromJson(saveData, InformationData.class);
                    System.out.println(information);
                    System.out.println(" ");
                    
                    line.close();
                    write.close();  

                } catch (IOException ex) {
                    
                }           
            }                                       
        }



}
