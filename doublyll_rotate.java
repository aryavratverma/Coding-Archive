/*Given a doubly linked list, rotate the linked list counter-clockwise by P nodes. Here P is a given positive integer and is smaller than the count of nodes(N) in a linked list.

Input:
The first line of input contains an integer T denoting the no of test cases. For each test case, the first line of input contains two integers N and P denoting the number of nodes in Linked List and the number of nodes to be rotated respectively.*/




import java.util.*;

import java.io.*;

class Node {

    int data;

    Node prev, next;

    
    public Node (int d){
 
       this.data = d;
 
   }
}

public class doubly_LL {
 
   
    static void display(Node node){

        while(node != null){
       
     System.out.print(node.data+" ");
     
       node = node.next;

        }
  
      System.out.println();

    }
   
 
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while(t-- > 0){
		 
   int n = sc.nextInt();

		    int p = sc.nextInt();

		       
		    //Entering the data

		    Node head = new Node(sc.nextInt());

		    Node curr = head;
	
	    
		    //Entering the rest of the list
		
    for(int i=0; i<n-1; i++){
		 
       int d = sc.nextInt();
		 
       curr.next = new Node(d);

		        curr = curr.next;

		    }
        
    
            Gfg obj = new Gfg();
   
         display(obj.rotateP(head, p));
	
	}
	}
}

}

class Node {
 
   int data;
 
   Node next, prev;

}

class Gfg {
    
Node rotateP (Node head, int p){

        //Write your code here
   
     while(p!=0){
  
          Node temp=head;
    
        Node firstnode=head;
      
      head=head.next;
 
           while(temp.next!=null){
  
             temp=temp.next;
     
           
            }

            temp.next=firstnode;
 
           firstnode.next=null;
      
      p--;
   
        
        }

      return head;  
   
 }
}