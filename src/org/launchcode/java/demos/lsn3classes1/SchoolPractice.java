package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.List;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student megan = new Student("Megan", 1, 4.0);
        Student tom = new Student("Tom", 1, 3.0);
        List<Student> latinStudents = new ArrayList<>();
        latinStudents.add(megan);
        latinStudents.add(tom);
        Teacher bilbo = new Teacher("Bilbo", "Baggins", "Latin", 33);
        Course latinForBeginners = new Course("Latin for Beginners", bilbo, latinStudents);
        

    }
}
