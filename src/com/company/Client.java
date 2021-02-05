package com.company;

public class Client {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Damean", "Alexandra") // mandatory parameters
                .addAge("21") // optional
                .addGender("F") // optional
                .addHasExperience(true) // optional
                .build(); // to get back student option
        System.out.println(student);
    }
}
