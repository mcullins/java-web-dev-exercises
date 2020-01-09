package org.launchcode.java.stuidos.countingchars;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {
    public static void main(String[] args) {
        String TEST_TEXT = "This is some test text.";

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter some text to be counted or enter to use default text: ");
            String inputText = input.nextLine();
            if ("".equals(inputText)) {
                inputText = TEST_TEXT;
            }
            Map<String, Integer> countedChars = countChars(inputText);

            System.out.println("Counting characters!");
            for (Map.Entry<String, Integer> countedChar : countedChars.entrySet()) {
                System.out.println(countedChar.getKey() + ": " + countedChar.getValue());
            }
        } catch (Exception e) {
            System.err.println("Bad entry!");
            System.exit(1);
        }
    }


    private static Map<String, Integer> countChars(String inputText) {
        char[] charsInStr = inputText.toCharArray();
        Map<String, Integer> countedChars = new HashMap<>();

        for (char curChar : charsInStr) {
            if (countedChars.get(curChar + "") != null) {
                int curVal = countedChars.get(curChar + "");
                curVal++;
                countedChars.put(curChar + "", curVal);
            } else {
                countedChars.put(curChar + "", 1);
            }
        }
        return countedChars;
    }
}