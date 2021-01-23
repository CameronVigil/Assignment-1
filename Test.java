 /**
*Description: This program takes a string and a character from the user and uses
*recursion to count the number of occurrences of the character in the string.
*Class: Fall - COSC 2436.82401
*Assignment1: Recursion
*Date: 01/22/2021
*@author  Cameron Vigil
*@version 1.1.01
*/ 

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        // reads a line from user
        System.out.println("Please type a string of characters:");
        char[] chars = myObj.next().toCharArray();
        // reads character from user
        System.out.println("Please type a character to count:");
        char ch = myObj.next().charAt(0);
        //prints total
        System.out.println("Number of occurrences of '" + ch + "' in the string '" + String.valueOf(chars) + "': " + Recursion.count(chars, ch));
        myObj.close();
    }
}