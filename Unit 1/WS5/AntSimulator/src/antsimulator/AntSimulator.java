/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antsimulator;

import ec.edu.espe.FileManage.utils.Data;
import ec.edu.espe.antsimulator.model.Area;

/**
 *
 * @author Fernando Pallasco
 */
public class AntSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Area area = new Area();
        area.setHeigh(10);
        area.setWidth(20);
        
        String dataToSave = area.getHeigh() + "," + area.getWidth();
        
        Data.save("data.csv", dataToSave);
    }
    
}
