 /**
*Description: This program will displays a string without any user interaction
*Class: Fall - COSC 2436.82401
*Assignment1: Recursion
*Date: 01/22/2021
*@author  Cameron Vigil
*@version 1.1.01
*/ 
 
//For each method, you will also be required to create docstring as follows:
/**Method Detailed Description
* @param String as args
* @return Termination code as int, 0 for normal, anything else is error condition
* @throws Nothing is implemented
*/ 

//import java.io.*;
import java.util.Scanner;



public class Test {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
                
        System.out.println("Please type a string of characters:");
        char[] chars = myObj.next().toCharArray(); // reads a line from user
        System.out.println("Please type a character to count:");
        char ch = myObj.next().charAt(0);// reads character from user
        
        /*System.out.println("String:");
        for(int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }
        System.out.println("Character:" + ch);*/
        System.out.println("Count:" + Recursion.count(chars, ch));
        
        myObj.close();
    }
}