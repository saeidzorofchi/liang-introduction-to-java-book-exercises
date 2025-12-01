package org.example.chapter02.exercise03;

//(Convert feet into meters) Write a program that reads a number in feet, converts it
//to meters, and displays the result. One foot is 0.305 meter.

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number in feet : ");
        double feet = scanner.nextDouble();
        System.out.println("Value converted to meters: : " + feet * 0.35);


    }
}
