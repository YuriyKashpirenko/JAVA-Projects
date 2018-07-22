
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuriy
 */

/*
Task
Complete the insert function in your editor so that it creates a new Node 
(pass DATA as the Node constructor argument) and inserts it at the tail of the linked list referenced by the HEAD parameter. 
Once the new node is added, return the reference to the HEAD node.

Note: If the HEAD argument passed to the insert function is null, then the initial list is empty.

Input Format:
The insert function has 2 parameters: a pointer to a Node named HEAD, and an integer value, DATA.
The constructor for Node has 1 parameter: an integer value for the DATA field.
You do not need to read anything from stdin.

Output Format:
Your insert function should return a reference to the HEAD node of the linked list.

Sample Input:
The following input is handled for you by the locked code in the editor:
The first line contains T, the number of test cases.
The T subsequent lines of test cases each contain an integer to be inserted at the list's tail.

4
2
3
4
1

Sample Output:
The locked code in your editor prints the ordered data values for each element in your list as a single line of space-separated integers:

2 3 4 1

*/


class Solution {
    
    public static  Node insert(Node head,int data) {
// This will handle cases where the head node is empty.
// Which is just an edge case.
if (head == null) {
    return new Node(data);
}

// This is actual recursion. 
// We check if the node next is empty 
// i.e. the node is the last node or the tail of the LL
// and if so, add the new node as to it's next. 
// This is the base case for recurison in the else clause.
if (head.next == null) {
    head.next = new Node(data);
}
else {
    insert(head.next,data);
}

return head;

    }
    
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
