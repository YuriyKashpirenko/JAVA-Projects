/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst_level_order_traversal;

/**
 *
 * @author Yuriy
 */
public class Node {
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
