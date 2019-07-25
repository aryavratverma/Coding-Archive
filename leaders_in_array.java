/*Given an array of positive integers. Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. */

import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {
	
public static void main (String[] args)throws IOException {
	    
BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	 
   int c= Integer.parseInt(reader.readLine());

	    while(c!=0){

	        c--;
	    
    int size= Integer.parseInt(reader.readLine());
	   
     int[] b= new int[size];
	   
     String[] a= reader.readLine().split(" ");
	     
   for(int i=0;i<size;i++){
	        
    b[i]=Integer.parseInt(a[i]);
	  
      }
	   
      for(int i=0;i<size-1;i++){
	         
    if(b[i]>b[i+1]){
	               
  System.out.print(b[i]+" ");
	           
      i++;
	                 
	           
  }
	             
	            
	  
       }
	     
    if(b[size-1]<b[size-2]){
	            
     System.out.print(b[size-1]);
	            
 }
	         
System.out.println();    
	        
	
    }
		
	}
}