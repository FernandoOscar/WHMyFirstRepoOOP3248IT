/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Fernando Pallasco
 */
public class Area {
    private int width;
    private int heigh;
    private int initNumberOfFoodPiles;
    private int tickDuration;
    private String name;
    private boolean busy;

    @Override
    public String toString() {
        return "Area{" + "width=" + width + ", heigh=" + heigh + 
                ", initNumberOfFoodPiles=" + initNumberOfFoodPiles + 
                ", tickDuration=" + tickDuration + ", name=" + name + ", busy=" 
                + busy + '}';
    }

  
    public Area() {
        heigh = 20;
        width = 20;
        initNumberOfFoodPiles = 1;
        tickDuration = 10;
        name = "area51";
        busy = true;

    }
      public Area(int width, int heigh, int initNumberOfFoodPiles, int tickDuration, String name, boolean busy) {
        this.width = width;
        this.heigh = heigh;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.tickDuration = tickDuration;
        this.name = name;
        this.busy = busy;
    }

    public void setup(){
        
    }
    
    public void addColony(Colony colony){
        
    }
    
    public void addAntEater(AntEater antEater){
        
    }
    
    public boolean isAnyFoodRemaining(){
        
        return true;
    }
    
    public Cell getCell(int row, int col){
        Cell cell=new Cell();
        
        return cell;
        
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the heigh
     */
    public int getHeigh() {
        return heigh;
    }

    /**
     * @param heigh the heigh to set
     */
    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    /**
     * @return the initNumberOfFoodPiles
     */
    public int getInitNumberOfFoodPiles() {
        return initNumberOfFoodPiles;
    }

    /**
     * @param initNumberOfFoodPiles the initNumberOfFoodPiles to set
     */
    public void setInitNumberOfFoodPiles(int initNumberOfFoodPiles) {
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
    }

    /**
     * @return the tickDuration
     */
    public int getTickDuration() {
        return tickDuration;
    }

    /**
     * @param tickDuration the tickDuration to set
     */
    public void setTickDuration(int tickDuration) {
        this.tickDuration = tickDuration;
    }
}
