/*Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.*/

import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) throws IOException {

	    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

	    int t=Integer.parseInt(reader.readLine());
	
       while(t!=0){

	        int size= Integer.parseInt(reader.readLine());
	
        int[] arr= new int[size];
	 
       String[] a= reader.readLine().split(" ");

	        
	        for(int i=0;i<size;i++){

	            arr[i]= Integer.parseInt(a[i]);

	            
	        }
	
        if(size==1){System.out.println(arr[0]);}else{

	         int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
  
        for (int i = 0; i < size; i++) 
        { 
   
         max_ending_here = max_ending_here + arr[i]; 

            if (max_so_far < max_ending_here) 

                max_so_far = max_ending_here;
 
            if (max_ending_here < 0) 

                max_ending_here = 0; 
 
       } 
      
  if(max_so_far>0){
   
         System.out.println(max_so_far);
 
       }else{
    
        System.out.println(-1);
 
       }}
      
  t--;
	
    }
		

	}

}