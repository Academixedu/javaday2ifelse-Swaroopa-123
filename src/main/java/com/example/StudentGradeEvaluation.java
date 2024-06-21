package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Enter your age ");
        int age = in.nextInt();
        System.out.println("Enter your exam score");
        int score = in.nextInt();
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("enter the name:"+name );
        System.out.println("enter the age :"+age );
        System.out.println("enter the score :"+score );
        System.out.println("grade:"+grade);
    }
}