/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package regexpatternsintotodatabase;

/**
 *
 * @author Yuriy
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays.*;

/* 
Objective
Regular Expressions, Patterns, and Intro to Databases 

Task
Consider a database table, Emails, which has the attributes First Name and Email ID. 
Given N rows of data simulating the Emails table, print an alphabetically-ordered 
list of people whose email address ends in @gmail.com.

Input
6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
*/

public class Solution {
      
        public static void alphabetSort (ArrayList<String> list){
            //sort array list in alphabet order
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.print((list.get(i)).toString()+"\n");
                }
        }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        ArrayList<String> list = new ArrayList<String>();
        //register example
        String myRegEx = "@gmail.com";
        //pattern
        Pattern p = Pattern.compile(myRegEx);
        
    
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String s = Arrays.toString(firstNameEmailID);
            
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            
            //matcher
            Matcher m = p.matcher(emailID);
            //add to array list if pattern is matchinig with email address
            if(m.find()){
                list.add(firstName);
            }
            
        }
        //sort and print array list
        alphabetSort(list);
        scanner.close();
    }
}

