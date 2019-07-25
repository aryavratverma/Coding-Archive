/*Given two arrays X and Y of positive integers, find number of pairs such that xy > yx (raised to power of) where x is an element from X and y is an element from Y.*/


import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	int t= Integer.parseInt(reader.readLine());

		while(t!=0){
		 
   t--;
	
	    String[] a= reader.readLine().split(" ");
		 
   int size1= Integer.parseInt(a[0]);
		
    int[] b= new int[size1];
		  
  int size2= Integer.parseInt(a[1]);

		    int[] c= new int[size2];
	
	    String[] bstr=reader.readLine().split(" ");
		  
  String[] cstr=reader.readLine().split(" ");
		  
  for(int i=0;i<size1;i++){
		    
    b[i]=Integer.parseInt(bstr[i]);

		    }
		    
for(int i=0;i<size2;i++){

		        c[i]=Integer.parseInt(cstr[i]);

		    }
		    
int count=0;

		    for(int i=0;i<size1;i++){
	
	        for(int j=0;j<size2;j++){
		  
          if(Math.pow(b[i],c[j])>Math.pow(c[j],b[i])){count++;}

		            
		        }
	
	    }

		     System.out.println(count);
		  
  
		    
		}
	}
}