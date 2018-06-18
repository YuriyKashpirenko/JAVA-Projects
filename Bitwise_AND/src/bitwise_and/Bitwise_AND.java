/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwise_and;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author Yuriy
 */


/*
Objective
Bitwise operations (AND, OR)

Task
Given set S={1,2,3,....,N}. Find two integers, A and B (where A<B), from set S such that 
the value of A&B is the maximum possible and also less than a given integer, K. In this case, & represents the bitwise AND operator.

Input
3
5 2
8 5
2 2

*/


public class Bitwise_AND {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {       
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            aOrbLessThenN(n, k);
        }
        scanner.close();
    }
    
    /*
    Because K <= N the condition (K-1 OR K <= N) is always true in cases where K-1 is even. 
    In cases where K-1 is odd, the condition (K-1 OR K <= N) sometimes evaluates to false 
    (the lowest higher number is bigger than N), in which case the answer is K-2. 
    When it evaluates to true, the answer is K-1.
    */
    
        public static void aOrbLessThenN (int n, int k){
            if((k-1 | k) <= n) {System.out.println(k-1);}
            else {System.out.println(k-2);}
    }
    
}
