/*https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0*/


import java.util.*;

import java.lang.*;

import java.io.*;

 
class GFG {
	public static void main (String[] args)throws IOException {
	
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	 
   int cases= Integer.parseInt(reader.readLine());

	    for(int i=0;i<cases;i++){
	 
       int size=Integer.parseInt(reader.readLine());

	        int[] a= new int[size];

	        String[] str = reader.readLine().split(" ");
	 
       for(int j=0;j<size;j++){

	            a[j]=Integer.parseInt(str[j]);

	            	        }
	  
          	        Arrays.sort(a);
	   
         	        for(int j=0;j<size;j++){

	           System.out.print(a[j]+" ");
	    
        	        }
	  
          	        System.out.println();
	  
          	        
	        
	    }
		//code
	}
}