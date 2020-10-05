package main;

import model.Student;

public class ClassAndObject {
    public static void main(String[] args) {
        //initialize variable
        Student student = new Student();
        //set value
        student.setName("Jose Leo Hurna");
        student.setAge(27);
        student.setGender("Male");
        student.setIdNum("BEE201212963");
        //output
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getIdNum());
    }
}
