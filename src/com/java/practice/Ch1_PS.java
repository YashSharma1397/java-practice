package com.java.practice;

//java program to convert Kilometers to Miles

import java.util.Scanner;

public class Ch1_PS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the distance in Kilometers: ");
        float kms = sc.nextFloat();
//        Formula for conversion of Kilometers to Miles:
        float miles = kms*0.621371f;
        System.out.println("The distance entered by user in Miles is: " + miles);
    }
}
