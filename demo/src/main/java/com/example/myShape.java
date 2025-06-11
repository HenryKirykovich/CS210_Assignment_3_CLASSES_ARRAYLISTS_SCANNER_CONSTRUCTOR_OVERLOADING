package com.example;

import java.util.Scanner;

// Henadzi(Henry) Kirykovich
// CS 201 
// Description: Program for calculation square of rectangle, circle


public class myShape {
        
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome My_Calculator_area");
        System.out.println();
        System.out.println("What area would you like calculated 1) rectangle 2) triangle 3) circle ");
        int choice = input.nextInt();
     
        int areaRec = 0;
        double areTria;
        double areaCir = 0.00; 

     
            if (choice == 1) {
                System.out.println("Please put you widht");
                int widht = input.nextInt();
                System.out.println("PLease put your height");
                int height = input.nextInt();
                Area areaRectangle  = new Area(widht, height);
                areaRec = areaRectangle.AreaRectangle();
             
                System.out.printf("The reactangle is : %d", areaRec);

            } else if(choice ==2) {
                System.out.println("Please put you widht");
                int widht = input.nextInt();
                System.out.println("PLease put your base");
                Double base = input.nextDouble();
                Area areaRectangle  = new Area(widht, base);
                areTria = areaRectangle.AreaTriangle();
                System.out.printf("The triangle is : %.2f", areTria);

            } else if (choice == 3) {
                System.out.println();
                System.out.println("Please put your radius");
                Double radius = input.nextDouble();
                Area areaCircle  = new Area(radius);
                areaCir = areaCircle.AreaCircle();
            
                System.out.printf(" The radius circle is : %.2f", areaCir);
            } 
     
        
        input.close();
    }
}