package org.launchcode;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive today? ");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas did you use today? ");
        double gallons = input.nextDouble();
        input.close();
        double mpg = miles/gallons;
        System.out.println("Yor car MPG is "+ mpg );

    }
}
