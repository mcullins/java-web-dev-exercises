package exercises;

import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        String aliceQuote = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or conversations " +
                "in it, 'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";
        System.out.println("Please enter search term for the Alice Quote:");
        String searchTerm = input.nextLine();
        input.close();
        if (aliceQuote.toLowerCase().contains(searchTerm.toLowerCase())){
            Integer searchIndex = aliceQuote.toLowerCase().indexOf(searchTerm.toLowerCase());
            Integer searchLength = searchTerm.length();
            System.out.println("Your search word is at index " + searchIndex + " and the length " +
                    "is " + searchLength + ".");
            String[] splitQuote = aliceQuote.split(searchTerm);
            String newQuote = splitQuote[0].concat(splitQuote[1]);
            System.out.println(newQuote);
        } else {
            System.out.println("Search term not found.");
        }


    }
}
