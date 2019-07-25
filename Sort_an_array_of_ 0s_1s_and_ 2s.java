/*Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.*/
import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {
	
public static void main (String[] args)throws IOException
	{
	   
 BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

	    int c= Integer.parseInt(reader.readLine());
	   
 while(c!=0){
	   
     c--;
	       
 int size= Integer.parseInt(reader.readLine());
	     
   String[] a = reader.readLine().split(" ");
	      
  Arrays.sort(a);
	     
   for(String str: a){
	            
System.out.print(str+" ");
	  
      }
	     
   System.out.println();

	    }
	
	}
}