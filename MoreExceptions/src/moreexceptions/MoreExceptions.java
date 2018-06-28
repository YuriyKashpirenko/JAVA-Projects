/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moreexceptions;

import java.util.Scanner;

/*
Objective:
Throwing and propagating an exception

Task:
Write a Calculator class with a single method: int power(int,int). 
The power method takes two integers,N and P, as parameters and returns 
the integer result of N power of P. If either N or P is negative, 
then the method must throw an exception with the message: 
n and p should be non-negative.

Note: 
Do not use an access modifier (e.g.: public) in the declaration for your Calculator class.

Input Format:
Input from stdin is handled for you by the locked stub code in your editor. 
The first line contains an integer,T , the number of test cases. 
Each of the T subsequent lines describes a test case in space-separated integers 
denoting N and P, respectively.

Constraints:
No Test Case will result in overflow for correctly written code.

Output Format:
Output to stdout is handled for you by the locked stub code in your editor. 
There are T lines of output, where each line contains the result of N power P as 
calculated by your Calculator class' power method.

Sample Input:
4
3 5
2 4
-1 -2
-1 3

Sample Output:
243
16
n and p should be non-negative
n and p should be non-negative

*/




/**
 *
 * @author Yuriy
 */
public class MoreExceptions {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }   
}

class Calculator {
    int power (int n, int p) throws Exception{
        if (n < 0 || p < 0) {
            throw new Exception ("n and p should be non-negative");
        }
        else {
        int res = (int)Math.pow(n, p);
        return res;
        }
    }
}
