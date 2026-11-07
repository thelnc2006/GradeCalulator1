package com.example;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!");
        }
        else if (marks >= 90) {
            System.out.println("Grade: A");
        }
        else if (marks >= 50) {
            System.out.println("Grade: B");
        }
        else if (marks >= 40) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}

