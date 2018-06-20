/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Yuriy
 */

/*
Objective:
Sorting algorithm called Bubble Sort

To Consider:
Consider the following version of Bubble Sort:

for (int i = 0; i < n; i++) {
    // Track number of elements swapped during a single array traversal
    int numberOfSwaps = 0;
    
    for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            swap(a[j], a[j + 1]);
            numberOfSwaps++;
        }
    }
    
    // If no elements were swapped during a traversal, array is sorted
    if (numberOfSwaps == 0) {
        break;
    }
}


Task:
Given an array, A, of size N distinct elements, sort the array in ascending order 
using the Bubble Sort algorithm above. Once sorted, print the following 3 lines:

    1. Array is sorted in numSwaps swaps.
    where numSwaps is the number of swaps that took place.
    2. First Element: firstElement
    where firstElement is the first element in the sorted array.
    3. Last Element: lastElement
    where lastElement is the last element in the sorted array.

Hint: To complete this challenge, need to add a variable that keeps a running tally of all swaps that occur during execution. 

Input:
3
1 2 3

*/

public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        System.out.println (Arrays.toString(a));
        
        int numSwaps = 0;
        int firstEl = 0, lastEl = 0;
        
        for (int j = 0; j < a.length; j++){
            for (int i = 0; i < a.length-1; i++){
                if (a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    numSwaps++;
                }
            }
        }
        System.out.println (Arrays.toString(a));
        System.out.println ("Array is sorted in " + numSwaps + " swaps.");
        System.out.println ("First Element: " + a[0]);
        System.out.println ("Last Element: " + a[n-1]);
        //System.out.println ("NumSwaps: " + numSwaps);

    }
    
}
