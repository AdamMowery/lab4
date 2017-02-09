package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int input;

        String run = "yes";
        while (run.equals("yes")) {

            System.out.print("Enter an integer from 1 to 10:");
            input = scnr.nextInt();
            scnr.nextLine();
            int x = factorial(input);
            System.out.print("The factorial of " + input + " is ");
            System.out.println(x);

            System.out.println("Do you want to continue? (yes/no)");
            run = scnr.nextLine();


        }

    }

    private static int factorial(int input) {
        if (input == 1) {
            return 1;
        }
        return input * factorial(input - 1);


    }

}
