/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuesandstacks_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Yuriy
 */

/*
Obhective:
Stacks, Queues, Palindrome

Task:
A palindrome is a word, phrase, number, or other sequence of characters which reads 
the same backwards and forwards. 
To solve this challenge, we must first take each character in S, enqueue it in a queue, 
and also push that same character onto a stack. Once that's done, we must dequeue 
the first character from the queue and pop the top character off the stack, 
then compare the two characters to see if they are the same; 
as long as the characters match, we continue dequeueing, popping, and 
comparing each character until our containers are empty (a non-match means S isn't a palindrome). 
We need to write the following declarations and implementations:
1. Two instance variables: one for your , and one for your .
2. A void pushCharacter(char ch) method that pushes a character onto a stack.
3. A void enqueueCharacter(char ch) method that enqueues a character in the instance variable.
4. A char popCharacter() method that pops and returns the character at the top of the instance variable.
5. A char dequeueCharacter() method that dequeues and returns the first character in the instance variable.

Input:
racecar

Output: 
The word, racecar, is a palindrome.

*/

public class QueuesAndStacks_Palindrome {

    Stack <Character> stack = new Stack<Character>();
    Queue <Character> queue = new LinkedList<>();
    
void pushCharacter (char ch){
        stack.push(ch);
    }
    
    void enqueueCharacter(char ch){
        queue.add(ch);
    }
    
    char popCharacter(){
        return stack.pop();
    }
    
    char dequeueCharacter(){
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesAndStacks_Palindrome p = new QueuesAndStacks_Palindrome();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
    
}
