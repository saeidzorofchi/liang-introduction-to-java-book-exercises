package org.example.chapter01.exercise12;

//1.12 (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
//minutes, and 35 seconds. Write a program that displays the average speed in
//kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
public class Exercise12 {
    public static void main(String[] args) {

        System.out.println("Average speed in km/h = " + (24 * 1.6) / ((1 * 3600 + 40 * 60 + 35) / 3600.0));

    }
}

