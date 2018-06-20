/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Yuriy
 */

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
class Printer<T> {
    //T stands for the "Type"

    //print method
    //this method takes any object from class Printer and prints the value
    
    /*
    generic methods - just like type declarations, method declarations can be generic—that is, parameterized by one or more type parameters.
    example: static <T> void 
    */
    static <T> void printArray (Object [] Printer){
        for (int i = 0; i < Printer.length; i++){
            System.out.println(
                    Printer[i]
            );
        }

    }
    
}
