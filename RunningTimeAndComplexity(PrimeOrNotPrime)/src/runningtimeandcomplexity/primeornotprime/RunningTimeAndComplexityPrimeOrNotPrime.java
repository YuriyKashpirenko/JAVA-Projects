/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningtimeandcomplexity.primeornotprime;
import java.io.*;
import java.util.*;

/**
 *
 * @author Yuriy
 */

/*

Task
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. 
Given a number,N , determine and print whether it's Prime or Not Prime.

Note: If possible, try to come up with a O(square root of N) primality algorithm, 
or see what sort of optimizations you come up with for an O(N) algorithm. 

Input:
3
12
5
7

*/


public class RunningTimeAndComplexityPrimeOrNotPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int [] array = new int [T];
        
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        
        boolean prime = false;
        for (int j = 0; j < array.length; j++){
            prime = isPrime(array[j]);
            if (prime == false){System.out.println("Not prime");}
            else {System.out.println("Prime");}
        }
        
    }
    
    public static boolean isPrime(int n){
    if(n == 1){
        return false;
    }
    if(n == 2){
        return true;
    }
    for (int i = 2; i*i<=n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
    }
}
