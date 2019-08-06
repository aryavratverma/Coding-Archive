/*Given an array of integers arr[0..n-1], count all pairs (arr[i], arr[j]) in it such that i*arr[i] > j*arr[j], 0 =< i < j < n.

Example:

Input: arr[] = {5, 0, 10, 2, 4, 1, 6}

Output: 5*

/



import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) throws IOException {
	    
BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	    
int c= Integer.parseInt(reader.readLine());
	 
   while(c!=0){
	   
     c--;
	        
int size=Integer.parseInt(reader.readLine());

	        int[] a= new int[size];
	        
String[] b= reader.readLine().split(" ");
	        
for(int i=0;i<size;i++){
	         
   a[i]= Integer.parseInt(b[i]);
	            
	  
      }
	     
   int count=0;
	        
for(int i=0;i<size;i++){
	             
for(int j=i;j<size;j++){
	          
       if(i*a[i]>j*a[j]){
	             
   count++;
	              
   }
	           
  }
	        }
	    
    System.out.println(count);	   
 }
		//code
	}
}