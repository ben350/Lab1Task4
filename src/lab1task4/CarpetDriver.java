/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1task4;

import java.util.Scanner;

/**
 *
 * @author benjiramirez
 */
public class CarpetDriver {
    
    public static void main(String[] args) {
        //making the local vars
        Scanner scan = new Scanner(System.in);
        double cost;
        double length;
        double width;
        RoomDimension dim;
        RoomCarpet carpet;
        
        //asking the user for input
        System.out.println("Enter the length of the room");
        length = scan.nextDouble();
        System.out.println("Now enter the width of the room");
        width = scan.nextDouble();
        
        //creating the RoomDimension object using the entered data
        dim = new RoomDimension(length, width);
        //setting the cost to 8
        cost = 8;
        //making the roomCarpet object using dim and cost
        carpet = new RoomCarpet(dim, cost);
        //making the strings with the area and cost values
        String areaString = dim.toString();
        String costString = carpet.toString();
        //printing the area and cost to the user
        System.out.println("The area of the carpet is: " + areaString);
        System.out.println("The total cost for this carpet is: " + costString);
          
    }
}
