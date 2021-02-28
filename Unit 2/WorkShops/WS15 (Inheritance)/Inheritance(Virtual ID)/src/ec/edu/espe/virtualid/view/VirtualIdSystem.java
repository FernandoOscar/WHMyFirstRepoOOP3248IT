/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualid.view;

import ec.edu.espe.virtualid.model.Doctor;
import ec.edu.espe.virtualid.model.Person;
import ec.edu.espe.virtualid.model.Student;
import ec.edu.espe.virtualid.model.Director;


/**
 * @author FErnando Pallasco
 */
public class VirtualIdSystem {
    public static void main(String[] args) {
        Person student1 = new Person("Male", "Fernando", 48785445, 23);
        System.out.println("student --> "+student1);
        
        Student student = new Student("ofpallasco",48785445 , "Male", "Fernando",490543 , 23);
        System.out.println("student -> " +student);
        
        Director director = new Director("TI", "Software", "Male", "empty", 183984554, 55);
        System.out.println("director -> " +director);
        
        Doctor doctor = new Doctor("Doctor", "Male", "empty", 48893432, 44);
        System.out.println("doctor -> " +doctor);
    }
}
