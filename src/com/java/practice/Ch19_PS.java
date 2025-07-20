package com.java.practice;

import java.util.Scanner;

public class Ch19_PS {
    public static void main(String[] args) {
//        Program for finding whether a Year entered by user is Leap Year or not:
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Year: ");
        int year = sc.nextInt();
        if (year % 4 == 0)
        {
            System.out.println("The year " + year + " is a Leap year.");
        }
        else
        {
            System.out.println("The year " + year + " is not a Leap year.");
        }
    }
}
