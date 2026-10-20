package com.pluralsight;
import java.util.Scanner;
public class FullNameParser {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("***Full Name Parser***");

        // get input, use .trim
        System.out.print("Please enter your full name: ");
        String fullName = scnr.nextLine().trim();

        //get first/middle/last
        String[] nameParts = fullName.split("\\s+"); // splits name into parts

       String firstName = nameParts[0]; //first name
       String middleName = "";
       String lastName = nameParts[nameParts.length -1]; // last name

        if (nameParts.length ==3) {// checks for middle name
            middleName = nameParts[1]; // gets the middle name place it in middle place in array

        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        scnr.close(); // close scanner
    }
 }

