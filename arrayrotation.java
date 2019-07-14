/*Given an array of N size. The task is to rotate array by d elements where d is less than or equal to N.

Input:
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of three lines. The first line of each test case consists of an integer N, where N is the size of array.
The second line of each test case contains N space separated integers denoting array elements. The third line of each test case contains "d" .

Output:
Corresponding to each test case, in a new line, print the modified array.

Constraints:
1 = T = 200
1 = N = 200
1 = A[i] = 1000

Example:
Input
1
5
1 2 3 4 5
2

Output
3 4 5 1 2*/


import java.util.*;

import java.lang.*;

import java.io.*;

class GFG {

	public static void main (String[] args) throws IOException {

	    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(reader.readLine());
	  
  for(int i=0;i<n;i++){
	    
int size= Integer.parseInt(reader.readLine());

	    String[] arr = reader.readLine().split(" ");

	    int[] a= new int[size];
	  
  for(int j=0;j<size;j++){
	       
 a[j]= Integer.parseInt(arr[j]);
	
    }
	    
 int rotate_size= Integer.parseInt(reader.readLine());
	  
 while(rotate_size!=0){
	     
  int temp=a[0];
	  
     for(int k=1;k<size;k++){

	           a[k-1]=a[k];
	       
        }
	            
   a[size-1]=temp;
	          
     rotate_size--;
	 
  }
	   
	    
for(int j=0;j<size;j++){

	        System.out.print(a[j]+" ");
	
    }
	    }
		//code
	} 
}