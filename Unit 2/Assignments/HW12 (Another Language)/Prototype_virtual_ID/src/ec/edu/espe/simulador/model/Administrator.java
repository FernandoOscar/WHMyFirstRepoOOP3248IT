/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

/**
 *
 * @author LENOVO
 */
public class Administrator {
    private String Student[];
    
    boolean addDatabase(){
        return true;
}
    boolean createId(VirtualCard virtualCard){
        return true;
    }
    boolean removeStudent(Student student){
        return true;
    }

    /**
     * @return the Student
     */
    public String[] getStudent() {
        return Student;
    }

    /**
     * @param Student the Student to set
     */
    public void setStudent(String[] Student) {
        this.Student = Student;
    }
    
    
}
