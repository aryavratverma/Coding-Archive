
/* 
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.*/


import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {
	
public static void main (String[] args) throws IOException {
		
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(reader.readLine());

        while(t!=0){
 
           String[] a= reader.readLine().split(" ");
 
       int size= Integer.parseInt(a[0]);

        int sum= Integer.parseInt(a[1]);

        String[] b= reader.readLine().split(" ");
   
     int[] arr= new int[size];

        
        for(int i=0;i<size;i++){
    
        arr[i]= Integer.parseInt(b[i]);

        }
       
 
        int curr_sum=arr[0];

        int start_index=0;

        for(int j=1;j<size;j++){
    
        while(curr_sum>sum && start_index!=(j-1)){

                curr_sum=curr_sum-arr[start_index];
             
   start_index++;
 
           }
 
           if(curr_sum==sum){
     
       
                System.out.println(start_index+1+" "+j);

                break;

            }
   
         if(j<size){
     
           curr_sum=curr_sum+arr[j];
       
     }
        }
   
     t--;
     
   }
       

        
	}
}