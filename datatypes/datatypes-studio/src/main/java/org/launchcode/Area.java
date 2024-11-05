package org.launchcode;

import studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double r = input.nextDouble();
        input.close();
        if(r<=0 || Double.isNaN(r)){
            System.out.println("Please ender positive number!");
        }
        else {
            double area = Circle.getArea(r);
            System.out.println("The area of circle of radius " + r + " is: " + area);
        }

    }
}
