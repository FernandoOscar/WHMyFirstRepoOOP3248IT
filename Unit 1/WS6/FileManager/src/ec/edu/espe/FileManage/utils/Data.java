/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FileManage.utils;

import java.util.Scanner;

/**
 *
 * @author Fernando Pallasco
 */
public class Data {

    public static void save(String fileName, String record) {
        //TODO code to save data in a file

        System.out.println("calling save method, with parameters: " + fileName + "and " + record);

    }

    public static String find(String fileName, String data) {
        //TODO code to find information in a file
        String results;
        results = "Fernando Pallasco, 23, 0999010884";
        System.out.println("returnin---->" + results);

        return results;

    }

    public static boolean remove(String fileName, String data) {
        //TODO code to find information in a file
        boolean removed;
        removed = true;

        System.out.println(data+ "was removed");
        return removed;
    }

    public static boolean update(String fileName, String data) {
        //TODO code to find information in a file
        boolean modified;
        modified = true;
        System.out.println(data+ "was updated");

        return modified;

    }

    public static String finAll(String fileName, String data) {
        //TODO code to find information in a file
        String results;
        results = "Fernando Pallasco, 23,0999010884\nOscar Mancero,23,0999010884";
        
        System.out.println(" ");
        System.out.println("returnin---->" + results);
        return results;

    }

}
//jar java archive
//war web archive
//ear enterprise archive
