package org.example;

/*
 *  UCF COP3330 Summer 2021 Exercise 7 Solution
 *  Copyright 2021 Drake Scott
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class area {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        double length = input.nextDouble();
        System.out.print("What is the width of the room in feet? ");
        double width = input.nextDouble();
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.\nThe area is");

        double conversion = 0.09290304;
        double areaFeet = length * width;
        double areaMeters = areaFeet * conversion;

        System.out.println(areaFeet + " square feet");
        System.out.println(areaMeters + " square meters");
    }
}
