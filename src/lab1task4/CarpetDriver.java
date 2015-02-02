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
        double cost = 8;// default value changes later
        double length;
        double width;
        RoomDimension dim;
        RoomCarpet carpet;
        
        //asking the user for input
        System.out.println("Enter the length of the room");
        length = scan.nextDouble();
        System.out.println("Now enter the width of the room");
        width = scan.nextDouble();
        
        String userColor;
        
        boolean enteredWrongColor = false;
        do {
            System.out.println("What color carpet do you want?");
            System.out.println("Enter 'r' for red or 'b' for blue");
            userColor = scan.next();
            
            switch (userColor) {
                case "r":
                    cost = 7;
                    enteredWrongColor = false;
                    break;
                case "b":
                    cost = 9;
                    enteredWrongColor = false;
                    break;
                default:
                    System.out.println("Enter 'r' or 'b' please");
                    enteredWrongColor = true;
                    break;
            }
        } while (enteredWrongColor);
        
        
        //creating the RoomDimension object using the entered data
        dim = new RoomDimension(length, width);
        
        //making the roomCarpet object using dim and cost
        carpet = new RoomCarpet(dim, cost);
        
        //printing the area and cost to the user
        System.out.println("The area of the carpet is: " + dim.toString());
        System.out.println("The total cost for this carpet is: " + carpet.toString());
         
    }
}
