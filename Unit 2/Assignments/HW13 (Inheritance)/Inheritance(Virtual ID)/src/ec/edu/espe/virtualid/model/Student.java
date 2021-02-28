/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualid.model;

import java.util.Scanner;


/**
 *
 * @author Fernando Pallasco
 */
public class Student extends Person {

    private String email;
    private int phone;

    public Student(String email, int phone, String gender, String name, int id, int age) {
        super(gender, name, id, age);
        this.email = email;
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return "Student -> "+ "Name {" +getName()+ "} Gender {" +getGender()+ "} id {" 
                +getId()+ "} age {" +getAge()+ "} email {" + email + "} phone {" + phone + '}';
    }
    
    
    public void requestId(){
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Enter the name: ");
        setName(sn.nextLine());
    }
    

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    

    

    
    
}