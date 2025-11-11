package org.example.chapter02.exercise02;

//(Compute the volume of a cylinder) Write a program that reads in the radius
//and length of a cylinder and computes the area and volume using the following
//formulas:
//area = radius * radius * π
//volume = area * length

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of cylinder : ");
        double radius = scanner.nextDouble();
        System.out.print("Enter length of cylinder : ");
        int length = scanner.nextInt();
        //Math.PI is the number Pi as defined in the Java libraries. (You can also use the number Pi itself.)
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("area of cylinder is : " + area);
        System.out.println("volume of cylinder is : " + volume);

    }
}
