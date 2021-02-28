
package antsimulator;

import ec.edu.espe.antsimulator.model.Area;
import ec.edu.espe.filemanager.utils.Data;

/*
 * @author Fernando Pallasco
 */
public class AntSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Area area;
        int height;
        
        
        area = new Area();
        
        area.setHeigh(10);
        area.setInitNumberOfFoodPiles(2);
        area.setTickDuration(10);
        area.setWidth(20);
        String dataToSave = area.getHeigh()+","+ area.getWidth();
        Data.save("data.csv", dataToSave);
        
        Area area2;
        area2= new Area();
        System.out.println("area2 object-->" + area2);
        area2.setHeigh(20);
        System.out.println("area2 objet-->" + area2.getHeigh());
        Area area3;
        area3 = new Area(50, 40, 3, 4000, "area71", false);
        System.out.println("area3 object-->" + area3);
        
        area3= new Area();
        System.out.println("area3 object-->" + area3);
    }
    
    
}