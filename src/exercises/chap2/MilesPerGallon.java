package exercises.chap2;

import java.net.Inet4Address;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();
        System.out.println("How many gallons of gas have you consumed?");
        Double gallons = input.nextDouble();
        input.close();
        Double mpg = miles/gallons;
        System.out.println("Your MPG is " + mpg);
    }
}
