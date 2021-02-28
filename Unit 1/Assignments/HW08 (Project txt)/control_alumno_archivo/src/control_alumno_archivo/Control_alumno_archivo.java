/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control_alumno_archivo;

import java.io.*;
import java.util.*;

public class Control_alumno_archivo {

    public static void main(String[] args) throws IOException {
       
        Scanner lee=new Scanner (System.in);
       
       
        String nombre,nctrl,espec;
        int edad,sem;
        float fundp,prog1,prog2,ed;
       
        //variables del programa
        int opciones=1;
        while (opciones!=4)
        {// inicio del while
            
            //menu del usuario
            System.out.println("menu de alumno con archivos \n");
            System.out.println("1. agregar alumno");
            System.out.println("2. consultar alumno");
            System.out.println("3. listado general de alummnos");
            System.out.println("4. salir\n");
            opciones=lee.nextInt();
            switch(opciones)
            {//inicio witch
                case 1:
                    //preparando el obojeto para escribir en el archivo
                    File fichero=new File("alumnos.txt");
                    FileWriter fw=new FileWriter(fichero, true);
                    BufferedWriter bw=new BufferedWriter(fw);
                    PrintWriter escribef=new PrintWriter(bw);
                    
                    // pidiendo datos alumno
                    System.out.println("nombre del alumno");
                    nombre=lee.next();
                    System.out.println("numero de control");
                    nctrl=lee.next();
                    System.out.println("especialidad");
                    espec=lee.next();
                    System.out.println("edad");
                    edad=lee.nextInt();
                    System.out.println("semstre");
                    sem=lee.nextInt();
                    
                    
                    System.out.println("CALIFICACIONES: \n");
                    System.out.println("fundamentos de programacion:");
                    fundp=lee.nextFloat();
                    System.out.println("programacion I:");
                    prog1=lee.nextFloat();
                    System.out.println("programacion II:");
                    prog2=lee.nextFloat();
                    System.out.println("estructura de datos:");
                    ed=lee.nextFloat();
                    
                    escribef.println(nctrl);
                    escribef.println(nombre);
                    escribef.println(espec);
                    escribef.println(edad);
                    escribef.println(sem);
                    escribef.println(fundp);
                    escribef.println(prog1);
                    escribef.println(prog2);
                    escribef.println(ed);
                    
                    
                     System.out.println("Datos almacenados:");
                    escribef.close();
                    break;
                    
         case 2:
                    
                    File fichero1 = new File("alumnos.txt");
                    FileReader readerEnt = new FileReader(fichero1);
                    BufferedReader leerf = new BufferedReader(readerEnt);
                    
                    String control, ctrl_busca;
                    int encontrado=0;
                    System.out.println("Dame el numero de control del alumno: ");
                    ctrl_busca=lee.next();
                    while((control=leerf.readLine())!=null)
                    {
                        if (control.equals(ctrl_busca))
                        {
                            nombre=leerf.readLine();
                            espec=leerf.readLine();
                            edad=Integer.parseInt(leerf.readLine());
                            sem=Integer.parseInt(leerf.readLine());
                            fundp=Float.parseFloat(leerf.readLine());
                            prog1=Float.parseFloat(leerf.readLine());
                            prog2=Float.parseFloat(leerf.readLine());
                            ed=Float.parseFloat(leerf.readLine());
                            System.out.println("Datos del alumno: \n");
                            System.out.println("Nombre: "+nombre);
                            System.out.println("numero de control: "+control);
                            System.out.println("especialidad: "+espec);
                            System.out.println("edad: "+edad);
                            System.out.println("semestre: "+sem);
                            System.out.println("fundamentos de prog: "+fundp);
                            System.out.println("programacion I: "+prog1);
                            System.out.println("programacion II: "+prog2);
                            System.out.println("estructura de datos: "+ed);
                            encontrado++;
                        }//fin del if encontrado
                    }//fin de while buscar
                    if (encontrado==0)
                        System.out.println("El alumno no esta dado de alta");
                    leerf.close();
                    break;
                case 3:
                    
                    File fichero2 = new File("alumnos.txt");
                    FileReader readerEnt1 = new FileReader(fichero2);
                    BufferedReader leerf1 = new BufferedReader(readerEnt1);
                    System.out.println("Listado general de alumnos");
                    String control1;
                    System.out.println("nctrl   nombre   espec   edad" +
                            "   sem  FP   P1   P2   ED");
                    while((control1=leerf1.readLine())!=null)
                    {
                            nombre=leerf1.readLine();
                            espec=leerf1.readLine();
                            edad=Integer.parseInt(leerf1.readLine());
                            sem=Integer.parseInt(leerf1.readLine());
                            fundp=Float.parseFloat(leerf1.readLine());
                            prog1=Float.parseFloat(leerf1.readLine());
                            prog2=Float.parseFloat(leerf1.readLine());
                            ed=Float.parseFloat(leerf1.readLine());
                            System.out.println(control1+"   "+nombre+"   "+
                                    espec+"   "+edad+"   "+sem+"   "+fundp+
                                    "   "+prog1+"   "+prog2+"   "+ed);
                    }//fin de while listar
                    leerf1.close();
                    break;
                case 4: 
                    System.out.println("Salida del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, solo del 1 al 4...");
            }//fin de switch
        }//fin de while        
    }//fin de void main
}//fin del Main