/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

import java.util.Scanner;

/**
 *
 * @author Yuriy
 */

    /*
    The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. 
    You are given a pointer, , pointing to the root of a binary search tree.
    Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.
    
    Input Format

    The locked stub code in your editor reads the following inputs and assembles them into a binary search tree:
    The first line contains an integer, , denoting the number of nodes in the tree.
    Each of the subsequent lines contains an integer, , denoting the value of an element that must be added to the BST.

    Output Format

    The locked stub code in your editor will print the integer returned by your getHeight function denoting the height of the BST.

    Input:
    7
    3
    5
    2
    1
    4
    6
    7

    */


public class Solution {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println("Height: " + height);
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

    public static int getHeight(Node root){
      int height = 0;
      if (root != null){
          height = 1 + (Math.max(getHeight(root.left), getHeight(root.right))); 
          return height;
      }
      else {return -1;}     
    }
}
