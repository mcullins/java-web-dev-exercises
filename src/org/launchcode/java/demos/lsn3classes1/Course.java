package org.launchcode.java.demos.lsn3classes1;

import java.util.List;

public class Course {
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public Course(String name, Teacher teacher, List<Student> students){
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public String getName(){
        return name;
    }
    public void setName(String aName){
        name = aName;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public void setTeacher(Teacher aTeacher){
        teacher = aTeacher;
    }
    public List<Student> getStudents(){
        return students;
    }
    public void setStudents(List<Student> aStudents){
        students = aStudents;
    }
}
