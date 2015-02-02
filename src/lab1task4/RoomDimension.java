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
public class RoomDimension {
    
    private double length;
    private double width;
    
    public RoomDimension (double length, double width) {
        
        this.length = length;
        this.width = width;
        
    }
    
    double getArea() {
        double area = this.length * this.width;
        return area;
    }
    
    @Override
    public String toString() {
        //converting the area to string by getting the double from getArea()
         String areaString = Double.toString(getArea()); 
         
         return areaString;  
    }

    
}
