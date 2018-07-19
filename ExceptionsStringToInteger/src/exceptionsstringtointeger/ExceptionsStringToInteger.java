/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionsstringtointeger;

import java.util.Scanner;

/**
 *
 * @author Yuriy
 */

/*
Task:
Read a string, S, and print its integer value; if cannot be converted to an integer, print Bad String.

Note: must use the String-to-Integer and exception handling constructs built into your submission language. 
If attempt to use loops/conditional statements, you will get a score.

Input Format
A single string, S

Output
Print the parsed integer value of , or Bad String if cannot be converted to an integer.

Sample input: 
3

Sample Output:
3

Sample input:
za

Sample output:
Bad String

*/


public class ExceptionsStringToInteger {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //test();
        
        // TODO code application logic here
        Scanner in = new Scanner (System.in);              
        String S = in.next();
        in.close();
        try {
            int num = Integer.parseInt(S);
            System.out.println(num);
        }
        catch (Exception e){System.out.println("Bad String");}      
        
    }    
    
    //or
    
    public static void test(){
        Scanner in = new Scanner (System.in);  

        if(in.hasNextInt()){
            //int num = in.nextInt();
            System.out.println(in.nextInt());
        }
        else {String s = in.next();
            //System.out.println(s + " Bad String");}
            System.out.println("Bad String");}
    }
   
}
