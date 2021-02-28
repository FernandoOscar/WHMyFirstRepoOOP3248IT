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

/**
 *
 * @author Group4 
 */
public class Physiotherapy {
    
    private Scanner sc1 = new Scanner(System.in);
    private File file = new File("PhysMedicine.csv");
    
    private String medicine;
    
    public void genmed(){
        
        
        try{
            getFile().createNewFile();
            FileWriter write = new FileWriter(getFile(), true);
            PrintWriter line = new PrintWriter(write);
            System.out.print("Enter your name of medicament: ");
            setMedicine(getSc1().nextLine());
            System.out.println("Your medication was added correctly!!");
        
            line.println(getMedicine());
            line.close();
            write.close();
        }catch(IOException e){
            }
    }

    @Override
    public String toString() {
        return "Physiotherapy{" + "sc1=" + sc1 + ", file=" + file + ", medicine=" + medicine + '}';
    }

    public Physiotherapy(String medicine) {
        this.medicine = medicine;
    }

    /**
     * @return the sc1
     */
    public Scanner getSc1() {
        return sc1;
    }

    /**
     * @param sc1 the sc1 to set
     */
    public void setSc1(Scanner sc1) {
        this.sc1 = sc1;
    }

    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * @return the medicine
     */
    public String getMedicine() {
        return medicine;
    }

    /**
     * @param medicine the medicine to set
     */
    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
    

   
