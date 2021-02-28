/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualid.model;

/**
 * @author FErnando Pallasco
 */
public class Director extends Person {

    private String career;
    private String department;

    public Director(String career, String department, String gender, String name, int id, int age) {
        super(gender, name, id, age);
        this.career = career;
        this.department = department;
    }

    @Override
    public String showData() {
        return "Director -> " + "Name (" + getName() + ") Career (" + getCareer() + ") Gender {" + getGender()
                + "} id (" + getId() + ") age (" + getAge() + ") caree(" + career + ") department(" + department + ')';
    }

    @Override
    public String toString() {
        return "Director (" + "career=" + career + ", department=" + department + ')';
    }

    public boolean verifyDirector(String user) {
        String director = "Edison50";
        boolean temp;
        temp = director.equals(user);
        return temp;
    }

    public boolean verifyDirector(int code) {

        int pass = 1234;
        boolean temp;

        if (pass == code) {
            temp = true;

        } else {
            temp = false;
        }

        return temp;
    }

    /**
     *
     * @param name
     */
    public Director(String name) {
        super(name);
    }

    public Director(int id) {
        super(id);
    }

    /**
     * @return the careerAA
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
