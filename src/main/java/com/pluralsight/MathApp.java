package com.pluralsight;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {

        // scanner 'userInput' so it's clear what it does.
        Scanner userInput = new Scanner(System.in);

        // we use System.out.print (no 'ln') so the user types on the SAME line.
        System.out.print("Enter the first number: ");
        float firstNumber = userInput.nextFloat();

        System.out.print("Enter the second number: ");
        float secondNumber = userInput.nextFloat();

        // \n adds an extra empty line to keep things looking clean.
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        //use .next() because we only expect a single word/letter back.
        String choice = userInput.next();

        // only coding the multiplication for now
        float result = firstNumber * secondNumber;

        // we use the + sign to add our numbers and text together into a sentence.
        System.out.println("Result");
        System.out.println(firstNumber + " * " + secondNumber + " = " + result);

        // close your scanner when done to keep the computer's memory happy!
        userInput.close();
    }
}

