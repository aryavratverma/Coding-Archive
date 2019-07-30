/*Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.

Input:
The first line contains T, denoting the number of testcases. Then follows description of testcases. Each case begins with a single positive integer N denoting the size of array. The second line contains the N space separated positive integers denoting the elements of array A.

Output:
For each testcase, print "Yes" or  "No" whether it is Pythagorean Triplet or not (without quotes).*/


import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) throws IOException {

	    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

	    int t= Integer.parseInt(reader.readLine());

	    while(t!=0){

	      t--;
	 
       	      int size=Integer.parseInt(reader.readLine());
	        
              int[] arr= new int[size];
	      
              String[] str= reader.readLine().split(" ");
	       
              for(int i=0;i<size;i++){
	            
	      
    arr[i]= Integer.parseInt(str[i]);  
	   
     }
	   
     boolean bool=false;
	        
for(int i=0;i<size-3;i++){
	    
        int a=arr[i];
	          
  for(int j=i+1;j<size-2;j++){
	             
   int b=arr[j];
	            
    for(int k=j+1;k<size;k++){
	                
    int c=arr[k];
	               
     if((a*a+b*b)==(c*c)){
	                      
  bool=true;
	                     
   break;
	             
       }
	                }
	                
	            }
	        }
	       
if(bool){
	
           System.out.println("Yes");
	       
}else{
	           
System.out.println("No");
	
       }
	    }
	
	}
}