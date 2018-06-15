/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package more.linked.lists;

import java.util.Scanner;

/**
 *
 * @author Yuriy
 */


/*
Objective 
Remove duplicate values in Linked List

Task
A Node class is provided for you in the editor. A Node object has an integer data field, DATA , 
and a Node instance pointer,NEXT , pointing to another node (i.e.: the next node in a list).

A removeDuplicates function is declared in your editor, which takes a pointer to the HEAD node 
of a linked list as a parameter. Complete removeDuplicates so that it deletes any duplicate nodes 
from the list and returns the head of the updated list.

Note: The HEAD pointer may be null, indicating that the list is empty. 
Be sure to reset your NEXT pointer when performing deletions to avoid breaking the list.

Input
6
1
2
2
3
3
4
*/


public class Solution {

    /**
     * @param args the command line arguments
     */
    public static Node removeDuplicates(Node head) {
        //if (head == null) {return null;}
       Node cur = head;

        while (cur.next != null){
           if (cur.data == cur.next.data){
                cur.next = cur.next.next;
           }     
            else {cur = cur.next;}
        }
        return head;
    }

    
    public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
    public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    
}
