package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double radius;

        do {
            System.out.println("Enter a radius:");
            radius = input.nextDouble();
            if (radius > 0){
                break;
            }
            System.out.println("ERROR must be positive number");
        } while (radius < 0);

        input.close();

        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: "
            + area);
    }
}
