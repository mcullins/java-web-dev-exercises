package exercises.chap3;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class HashMapIds {
    public static void main(String[] args){
        String name;
        Integer id;
        HashMap<Integer, String> studentIds = new HashMap<>();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please enter student's name:");
            name = input.nextLine();
            if(!name.equals("")) {
                System.out.println("Please enter student ID:");
                id = input.nextInt();
                studentIds.put(id, name);
                input.nextLine();
            }
        } while (!name.equals(""));
        input.close();
        for (Map.Entry<Integer, String> studentId : studentIds.entrySet()) {
            System.out.println(studentId.getKey() + " " + studentId.getValue());
        }
    }
}
