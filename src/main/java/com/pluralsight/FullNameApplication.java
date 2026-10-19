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

        // create a new String that starts with the first name
        String fullName = firstName;

        // check if the user entered a middle name
        // the ! means Not, so we are checking if it is Not empty
        if (!middleName.isEmpty()) {
            // if there is a middle name, add a space and the middle name
            fullName = fullName + " " + middleName;

        }

        // always add a space and the last name
        // don't need an if statement because everybody has a last name
        fullName = fullName + " " + lastName;

        // check if the user entered a suffix
        // if suffix is not empty, add it
        if (!suffix.isEmpty()) {
            // add a coma, a space, and the suffix
            fullName = fullName + ", " + suffix;

        }
        // display the completed full name to the user
        System.out.println("Full name: " + fullName);

        // close the scanner because we are finished reading input
        read.close();
    }
}
