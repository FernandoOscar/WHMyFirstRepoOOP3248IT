package ec.edu.espe.simulador.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author MAJOF_Developers
 */
public class Student {

    private String id;
    private String name;
    private int age;
    private String email;
    private String address;
    private int phone;
    private String career;

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", address=" + address + ", phone=" + phone + ", career=" + career + '}';
    }

    public Student(String id, String name, int age, String email, String address, int phone, String career) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.career = career;
    }

    public Student() {

    }

    public void menu() throws IOException {

        Scanner sn = new Scanner(System.in);
        System.out.println("\t1. Request Id");
        System.out.println("\t2. Request Attention at Polyclinic");
        System.out.println("\t3. Exit");
        int option = sn.nextInt();

        switch (option) {

            case 1:
                requestId();
                break;

            case 2:
                requestAttention();
                break;

            case 3:
                System.out.println(" ");
                break;
        }

    }

    public void requestId() throws IOException {

        Scanner input = new Scanner(System.in);
        File file = new File("Requests.csv");
        System.out.println("Are you an old student? (O)");
        System.out.println("Are you a new student? (N)");
        System.out.print("Old(O) or New(N): ");
        char answer1 = input.next().charAt(0);
        input.nextLine();

        if (answer1 == 'O' || answer1 == 'o') {
            try {
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);

                System.out.print("Enter your id: ");
                id = input.nextLine();
                System.out.print("Enter your name: ");
                name = input.nextLine();
                System.out.print("Enter your age: ");
                age = input.nextInt();
                input.nextLine();
                System.out.print("Enter your email: ");
                email = input.nextLine();
                System.out.print("Enter your address: ");
                address = input.nextLine();
                System.out.print("Enter your phone: ");
                phone = input.nextInt();
                input.nextLine();
                System.out.print("Enter your career: ");
                career = input.nextLine();
                System.out.println("===========================================================");
                System.out.println("Your request has been successfully saved!!");
                System.out.println("This request has to be read and added to the database by the "
                        + "administrator");
                System.out.println("  BE PATTIENT ;) ");
                System.out.println("===========================================================");

                System.out.println(" ");
                String saveData = (id + "," + name + "," + age + "," + email + "," + address + ","
                        + phone + "," + career);
                line.println(saveData);
                line.close();
                write.close();

            } catch (IOException e) {
                System.out.println("Enter any character to continue");
            }

        }

        if (answer1 == 'N' || answer1 == 'n') {
            System.out.println("You need to approach the career director to add your request");
            System.out.println(" ");
        }
    }

    public void requestAttention() throws IOException {
        MedicalCheck check = new MedicalCheck();
        check.addAppointment();
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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

}
