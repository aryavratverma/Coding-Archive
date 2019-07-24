/*Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Input
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.

Output
For each test case, print the count of all triplets, in new line. If no such triplets can form, print -1.*/

import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) throws IOException {
	 
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 
   int t= Integer.parseInt(reader.readLine());
	
    while(t!=0){
	      
  int size= Integer.parseInt(reader.readLine());
	   
     int[] arr= new int[size];

	        String[] a= reader.readLine().split(" ");

	       for(int i=0;i<size;i++){
	
           arr[i]=Integer.parseInt(a[i]);
	 

	       }
	       int count=0;

	       
	       for(int i=0;i<size;i++){
	
           for(int j=i+1;j<size;j++){
	 
              int temp=arr[i]+arr[j];

	               for(int k=0;k<size;k++){
	  
                 if(temp==arr[k]){count++;
	  
                     
	                 
  }
	     
          }
	
               
	               
	           }

	       }
	   
    if(count>0){

	           System.out.println(count);

	       }else{

	           System.out.println(-1);

	       }
	      
 t--;
	    
   
	        
	    }
	   
     
	    }
			
}
