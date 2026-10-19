package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        // create a scanner so the user can type information
        Scanner read = new Scanner(System.in);

        // display a message asking to enter their name
        System.out.println("Please enter your name");

        // ask for first name and remove any extra spaces
        System.out.print("First name: ");
        String firstName = read.nextLine().trim();

        // ask for middle name with option if user leaves blank
        System.out.print("Middle name: ");
        String middleName = read.nextLine().trim();

        // ask for last name and remove any extra spaces
        System.out.print("Last name: ");
        String lastName = read.nextLine().trim();

        // ask for suffix with option to leave blank
        System.out.print("Suffix: ");
        String suffix = read.nextLine().trim();





    }
}
