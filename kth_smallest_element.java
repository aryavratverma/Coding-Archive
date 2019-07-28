/* Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.*/


import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args)throws IOException{
	 
BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

	 int c= Integer.parseInt(reader.readLine());

	 while(c!=0){

	     c--;
	
     in
t size= Integer.parseInt(reader.readLine());
	     
int[] a= new int[size];

	     String[] arr= reader.readLine().split(" ");
	 
    for(int i=0;i<size;i++){
	     
    a[i]= Integer.parseInt(arr[i]);
	  
   }
	   
  Arrays.sort(a);
	   
  int k= Integer.parseInt(reader.readLine());
	     

System.out.println(a[k-1]);

	 }
	 
	}
}