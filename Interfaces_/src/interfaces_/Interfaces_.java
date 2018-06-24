/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_;

import java.util.Scanner;

/**
 *
 * @author Yuriy
 */

/*
Objective:
Interfaces

Task:
The AdvancedArithmetic interface and the method declaration for 
the abstract divisorSum(n) method are provided.
Complete the implementation of Calculator class, which implements the AdvancedArithmetic interface. 
The implementation for the divisorSum(n) method must return the sum of all divisors of N.

Input: 
6

*/

interface AdvancedArithmetic{
    int divisorSum(int n);
}
     
class Calculator implements AdvancedArithmetic {
    public int divisorSum (int n){
         int sum = 0;
        for (int i = 1; i <= n; i++){
            if(n%i == 0) {sum +=i;}
        }
        return sum;
    }
}

public class Interfaces_ {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
    
}
