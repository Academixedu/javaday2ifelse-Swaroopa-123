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
        System.out.println("enter the name:"+name );
        System.out.println("enter the age :"+age );
        System.out.println("enter the score :"+score  );
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}