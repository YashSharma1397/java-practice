package com.java.practice;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("CBSE Exam Result Calculator(in %)");
        System.out.println("Welcome! NOTE: Each subject is having total marks of 100.");
        System.out.println("Please enter the obtained marks in Subject 1: ");
        Scanner sc = new Scanner(System.in);
        float sub1 = sc.nextFloat();
        System.out.println("Please enter the obtained marks in Subject 2: ");
        float sub2 = sc.nextFloat();
        System.out.println("Please enter the obtained marks in Subject 3: ");
        float sub3 = sc.nextFloat();
        System.out.println("Please enter the obtained marks in Subject 4: ");
        float sub4 = sc.nextFloat();
        System.out.println("Please enter the obtained marks in Subject 5: ");
        float sub5 = sc.nextFloat();

        float resultPercentage = ((sub1+sub2+sub3+sub4+sub5)/500)*100;
        System.out.println("The Student have received: " + resultPercentage);
    }
}
