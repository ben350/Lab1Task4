/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1task4;

/**
 *
 * @author benjiramirez
 * Lab1 Task4
 */
public class RoomCarpet {
    
    private RoomDimension size;
    private double carpetCost;
    
    public RoomCarpet( RoomDimension dim, double cost) {
        this.size = dim;
        this.carpetCost = cost;
    }
    
    public double getTotalCost() {
        //multiply the area*cost to get the total cost
        double totalCost = this.size.getArea() * this.carpetCost;
        return totalCost;
    }
    
    @Override
    public String toString() {
        //converting the area to string by getting the double from getArea()
         String totalCostString = Double.toString(getTotalCost()); 
         
         return totalCostString;  
    }
    
}
