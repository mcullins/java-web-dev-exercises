package exercises.chap3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListWords {
    public static void main(String[] args){
        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String str[] = sentence.split(" ");
        List<String> arrayListSentence = new ArrayList<String>();
        arrayListSentence = Arrays.asList(str);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of characters you would like to search for:");
        Integer desiredLength = input.nextInt();
        input.close();
        for (int i = 0; i<arrayListSentence.size(); i++) {
            if(arrayListSentence.get(i).length() == desiredLength) {
                System.out.println(arrayListSentence.get(i));
            }
        }
    }
}
