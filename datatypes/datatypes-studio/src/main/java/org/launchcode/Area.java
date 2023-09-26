package org.launchcode;

import java.util.Scanner;
//import java.util.Circle;
public class Area {

    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        String prompt = "Please enter a radius: ";

        System.out.println(prompt);
        double radius = userInput.nextDouble();
        System.out.println();

        double area = radius * radius * Math.PI;
        System.out.println(area);
    }
}
