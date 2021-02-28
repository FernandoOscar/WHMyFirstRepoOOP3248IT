/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualid.model;

/**
 *
 * @author FErnando Pallasco
 */
public class Person {

    String gender;
    private String name;
    private int id;
    private int age;


    public Person(String gender, String name, int id, int age) {
        this.gender = gender;
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String showData() {
        return "Person -> " +  " gender(" + gender + ") name(" + name + ") id(" + id + ") age(" + age + ')';
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String name) {
        this.name = name;
    }
    
    
    
    
    
    
    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the bornOn
     */


 

}
