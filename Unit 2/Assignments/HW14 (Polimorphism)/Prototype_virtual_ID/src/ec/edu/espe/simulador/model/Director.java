package ec.edu.espe.simulador.model;


import java.util.Scanner;

/**
 *
 * @author Developers
 */
public class Director extends Administrator{

    private String career;
    private String faculty;
    private int password = 1234;
    private String id;
    private Student student;

    
public Director(String career, String faculty, String id, Student student, String name) {
        super(name);
        this.career = career;
        this.faculty = faculty;
        this.id = id;
        this.student = student;
    }
    
    
    public Director(){
        
    }
    
    
    
    
    
    public void approveMotion() {

        Scanner input = new Scanner(System.in);

        System.out.print("\tAre you a student of the Universidad de las Fuerzas Armadas: ");
        System.out.println(" ");
        System.out.print("Yes(Y) or No(N): ");
        char answer1 = input.next().charAt(0);
        input.nextLine();

        if (answer1 == 'Y' || answer1 == 'y') {
            System.out.println("You can acces to benefit");
        }

        if (answer1 == 'N' || answer1 == 'n') {
            System.out.println("Only students can acces");
        }

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
     * @return the faculty
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * @param faculty the faculty to set
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * @return the password
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    
    
    
    
    

}
