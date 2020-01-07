package exercises;

import java.util.Scanner;

public class CalculateDims {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide length of rectangle: ");
        Integer length = input.nextInt();
        System.out.println("Please provide a height of rectangle: ");
        Integer height = input.nextInt();
        input.close();
        Integer area = length*height;
        System.out.println("The area of your rectangle is " + area);
    }
}
