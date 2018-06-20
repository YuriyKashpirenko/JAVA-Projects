/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst_level_order_traversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Yuriy
 */

    /*
    Task
    A level-order traversal, also known as a breadth-first search, 
    visits each level of a tree's nodes from left to right, top to bottom. 
    You are given a pointer, ROOT, pointing to the root of a binary search tree. 
    Complete the levelOrder function provided in your editor so that it prints 
    the level-order traversal of the binary search tree.
    
    Input Format

    The locked stub code in your editor reads the following inputs and assembles them into a BST:
    The first line contains an integer, T (the number of test cases).
    The T subsequent lines each contain an integer, DATA, denoting the value of an element that must be added to the BST.

    Output Format

    Print the DATA value of each node in the tree's level-order traversal as a single line of N space-separated integers.
    
    Sample Input
    
    6
    3
    5
    4
    7
    2
    1
    
    Sample Output
    
    3 2 5 1 4 7 
    
    */

public class Solution {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            System.out.println ("\nData of Nodes:");
            levelOrder(root);
    }
    
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    

    
    static void levelOrder(Node root){
      Queue<Node> queue = new LinkedList();
      if (root != null){
          // enqueue current root
          queue.add(root);
          
          // while there are nodes to process
          while (!queue.isEmpty()){
              // dequeue next node
              Node cur = queue.remove();
              
              System.out.print (cur.data + " ");
              
              // enqueue child elements from next level in order
              if (cur.left != null){queue.add(cur.left);}
              if (cur.right != null){queue.add(cur.right);}
          }

      }
      
    }
    
}
