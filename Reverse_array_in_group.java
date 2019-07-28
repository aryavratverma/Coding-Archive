/* Given an array arr[] of positive integers of size N. Reverse every sub-array of K group elements.*/


import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args)throws IOException {
	 
   BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	  
  int c= Integer.parseInt(reader.readLine());	
	//code

	  while(c!=0){
	    c--;

	    String s[]=reader.readLine().split(" ");
	  
  int size=Integer.parseInt(s[0]);
	  
  int[] arr=new int[size];
	 
   int group_size= Integer.parseInt(s[1]);

	    String[] a= reader.readLine().split(" ");
	
    for(int i=0;i<size;i++){arr[i]=Integer.parseInt(a[i]);}
	   
	    
    for(int i=0;i<size;i=i+group_size){
	         
   int left_index=i;
	       
     int right_index= Math.min(i+group_size-1,size-1);
	           
 int temp=0;
	         
   while(left_index<right_index){
	          
      temp=arr[left_index];
	         
       arr[left_index]=arr[right_index];
	          
      arr[right_index]=temp;
	             
   left_index++;
	              
  right_index--;
	                
	        
    }
	            
	        }
	 
 for(Integer obj:arr){
System.out.print(obj+" ");
} 
	  
System.out.println();
	  
	
}
	    
	}
}