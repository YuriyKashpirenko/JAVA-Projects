/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Yuriy
 */


/*
Objective: 
Generics

Task:
Write a single generic function named *printArray*; this function must take an array of 
generic elements as a parameter (the exception to this is C++, which takes a *vector*). 
The locked *Solution* class in your editor tests your function.

Note: *Do not* write overloaded functions.

Input:
3
1
2
3
2
Hello
World

*/


public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        
        // \n - is a new line
        System.out.println("\nResult:");
        
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }

    }
    
}
