package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString(){
        return topic + " is a course taught by " + instructor + " and contains the students " + enrolledStudents + ".";
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Object toBeCompared){
        Course diffCourse = (Course) toBeCompared;
        return diffCourse.getInstructor() == getInstructor();

    }

    public Teacher getInstructor(){
        return instructor;
    }

}
