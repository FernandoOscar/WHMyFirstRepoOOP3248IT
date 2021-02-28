/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualid.model;

/**
 *
 * @author Fernando Pallasco
 */
public class Doctor extends Person{
    
    private String tittle;

    public Doctor(String tittle, String gender, String name, int id, int age) {
        super(gender, name, id, age);
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Doctor -> {" + "Name {" +getName()+ "} Gender {" +getGender()+ 
                "} id {" +getId()+ "} age {" +getAge()+ "} tittle{" + tittle + '}';
    }

    
    
    
    
    

    /**
     * @return the tittle
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * @param tittle the tittle to set
     */
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    
    
}
