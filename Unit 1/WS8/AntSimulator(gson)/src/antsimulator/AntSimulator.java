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
        Area area;                  //vairable declaration (object declaration)
        area = new Area();          //Instatation -----> initialization
        area.setHeigh(10);
        area.setWidth(20);
        String dataToSave = area.getHeigh() + "," + area.getWidth();
        Data.save("data.csv", dataToSave);

        Area area2;
        area2 = new Area();
        System.out.println("area2 object-->" + area2);
        area2.setHeigh(20);
        System.out.println("area2 objet-->" + area2.getHeigh());
        Area area3;
        area3 = new Area(50, 40, 3, 4000, "area71", false);
        System.out.println("area3 object-->" + area3);

        area3 = new Area();
        System.out.println("area3 object-->" + area3);
        /*
        Data.save("Group2.csv","Fernando Pallasco, 23,16,18,19");
        Data.find("Group2.csv","Oscar");
        Data.finAll("Group2.csv");
        String dataToSave = area.getHeigh()+","+area.getWidth();
        Data.save("Group2.csv", dataToSave);
         */

    }

}
