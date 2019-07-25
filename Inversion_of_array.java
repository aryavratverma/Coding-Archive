/*Given an array of positive integers. The task is to find inversion count of array.

Inversion Count : For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.*/

import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) throws IOException {

		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		
int t= Integer.parseInt(reader.readLine());
	
	while(t!=0){
		
    t--;
	
	    int size= Integer.parseInt(reader.readLine());

		    int[] b= new int[size];
	
	    String[] a= reader.readLine().split(" ");
	
	    for(int i=0;i<size;i++){
		 
       b[i]= Integer.parseInt(a[i]);
		     
   
		    }
		
    int count=0;
		
    for(int i=0;i<size;i++){
		   
    int temp=b[i];
		       
for(int j=i+1;j<size;j++){
		           
if(temp>b[j]){
		               
count++;
		   
        }
		         
  
		       }
		       
		       
		      
		    }
		    
System.out.println(count);
		}
	}
}