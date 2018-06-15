/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested_logic;

import java.io.*;
import java.util.*;

/**
 *
 * @author Yuriy
 */


/*
Objective: 
Nested Logic

Task:
Program that calculates the fine (if any). The fee structure is as follows: 
1.If the book is returned on or before the expected return date, 
no fine will be charged (i.e.: fine=0) 

2.If the book is returned after the expected return day but still within 
the same calendar month and year as the expected return date, fine=15 Hackos × (the number of days late) 

3.If the book is returned after the expected return month but still within 
the same calendar year as the expected return date, the fine=500 Hackos × (the number of months late) 

4.If the book is returned after the calendar year in which it was expected, 
there is a fixed fine of 10000 Hackos 
10000 Hackos

Input:
9 6 2015
6 6 2015
*/


public class Nested_Logic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dAct = sc.nextInt();
        int mAct = sc.nextInt();
        int yAct = sc.nextInt();
        
        int dExp = sc.nextInt();
        int mExp = sc.nextInt();
        int yExp = sc.nextInt();

        sc.close();

        verifyDateFive(dAct, mAct, yAct, dExp, mExp, yExp);

   }
    
    public static void verifyDateFive(int dAct, int mAct, int yAct, int dExp, int mExp, int yExp){
        if (yAct > yExp){System.out.println(10000);}
        else if (mAct > mExp && yAct == yExp){
            System.out.println(500 * (mAct - mExp)); 
        }
        else if (dAct > dExp && mAct == mExp){
                System.out.println(15 * (dAct - dExp)); 
        }
        else {System.out.println(0);}
    }
}
