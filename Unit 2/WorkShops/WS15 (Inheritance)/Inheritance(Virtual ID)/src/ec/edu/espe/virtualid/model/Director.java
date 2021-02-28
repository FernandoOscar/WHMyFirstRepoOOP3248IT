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
public class Director extends Person{

    private String career;
    private String department;

    public Director(String career, String department, String gender, String name, int id, int age) {
        super(gender, name, id, age);
        this.career = career;
        this.department = department;
    }

   
    
    
    @Override
    public String toString() {
        return "Director -> "+"Name {" +getName()+ "} Gender {" +getGender()+ 
                "} id {" +getId()+ "} age {" +getAge()+"} caree{" + career + "} department{" + department + '}';
    }
    
 
    
    

    /**
     * @return the career
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career the career to set
     */
    public void setCareer(String career) {
        this.career = career;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
    
}
