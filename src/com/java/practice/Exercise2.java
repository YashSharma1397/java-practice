package com.java.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
//      Program for Rock Paper Scissors game
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        byte result = 0;
        byte roundResult = 0;
        byte sum = 0;

        System.out.println("Welcome to Rock Paper Scissors game !!!");

        for(int i = 1; i < 4; i++) {

            System.out.println("ROUND " + i);
            System.out.println("Please select a number corresponding to your choice: \n 1 - Rock \n 2 - Paper \n 3 - Scissors");

            int inputNumber = sc.nextInt();

            switch(inputNumber) {
                case 1 -> System.out.println("You have selected Rock.");
                case 2 -> System.out.println("You have selected Paper.");
                case 3 -> System.out.println("You have selected Scissors.");
            }

            //        Generating a random number between 1 and 3 (both inclusive)
            int max = 3, min = 1;
            int randomIntInRange = random.nextInt((max - min + 1) + min);

            switch(randomIntInRange) {
                case 1 -> System.out.println("Computer have selected Rock.");
                case 2 -> System.out.println("Computer have selected Paper.");
                case 3 -> System.out.println("Computer have selected Scissors.");
            }

            if (inputNumber != 1 && inputNumber != 2 && inputNumber != 3) {
                result = 0;
            } else if (inputNumber == randomIntInRange) {
                result = 1;
            } else if (inputNumber == 1 && randomIntInRange == 2) {
                result = 2;
            } else if (inputNumber == 1 && randomIntInRange == 3) {
                result = 3;
            } else if (inputNumber == 2 && randomIntInRange == 1) {
                result = 3;
            } else if (inputNumber == 2 && randomIntInRange == 3) {
                result = 2;
            } else if (inputNumber == 3 && randomIntInRange == 1) {
                result = 2;
            } else if (inputNumber == 3 && randomIntInRange == 2) {
                result = 3;
            }

            switch (result) {
                case 1 -> System.out.println("The round - " + i + " is Tie.");
                case 2 -> System.out.println("You have lost Round - " + i);
                case 3 -> System.out.println("You have won Round - " + i);
                default -> System.out.println("Please enter a valid number!");
            }
        }
    }
}
