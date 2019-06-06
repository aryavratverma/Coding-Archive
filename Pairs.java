/*
Given an array A of N positive integers and another number X. Determine whether or not there exist two elements in A whose sum is exactly X.*/



import java.util.*;

import java.lang.*;

import java.io.*;

class Pairs{
  
  static boolean checkPair(int[] arr, int  size, int k){
 
       Arrays.sort(arr);
      
  int low=0;
      
  int high=size-1;
    
    while(low<high){
      
  if(arr[low]+arr[high]==k)
       
     return true;
        
else if(arr[low]+arr[high]<k)
   
          low++;
           
  else
               
 high--;
       
         
        }
    
    return false;
        
    
    }
	
public static void main (String[] args) throws IOException{

	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


	    int n= Integer.parseInt(reader.readLine());

	    for(int i=0;i<n;i++){
	
        String[] str= reader.readLine().split(" ");

	        int size= Integer.parseInt(str[0]);

	        int k= Integer.parseInt(str[1]);
	
        int[] arr = new int[size];
	       
 String[] a= reader.readLine().split(" ");
	
        for(int j=0;j<size;j++){
	     
       arr[j]= Integer.parseInt(a[j]);
	     
   }
	        if(checkPair(arr,size,k)){
	
           
 System.out.println("Yes");
	  
           }else{
	       
         System.out.println("No");
	
             }
	        
	      
	    }
			}
}