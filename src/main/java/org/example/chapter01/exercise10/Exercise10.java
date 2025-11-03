package org.example.chapter01.exercise10;

//1.10 (Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes
//and 30 seconds. Write a program that displays the average speed in miles per
//hour. (Note 1 mile is equal to 1.6 kilometers.)

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println((14 / 1.6) / ((45 * 60 + 30) / 3600.0));
    }
}
