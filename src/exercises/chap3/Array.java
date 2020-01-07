package exercises.chap3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] numbers = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 != 0) {
                System.out.println(numbers[i]);
            }
        }
        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] splitSentence = sentence.split("\\.");
        System.out.println(Arrays.toString(splitSentence));
    }
}
