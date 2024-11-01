package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of rectangle: ");
        int length = input.nextInt();
        System.out.println("Please enter width of rectangle: ");
        int width = input.nextInt();
        int area = width*length;
        System.out.println("Area of rectangle is "+ area);
    }
}
