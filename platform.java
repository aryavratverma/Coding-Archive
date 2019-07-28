/*Given arrival and departure times of all trains that reach a railway station. Your task is to find the minimum number of platforms required for the railway station so that no train waits.

Note: Consider that all the trains arrive on the same day and leave on the same day. Also, arrival and departure times will not be same for a train, but we can have arrival time of one train equal to departure of the other.

In such cases, we need different platforms, i.e at any given instance of time, same platform can not be used for both departure of a train and arrival of another. */



import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args)throws IOException {
	  
  BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

	    int c= Integer.parseInt(reader.readLine());

	    while(c!=0){

	        c--;
	   
     int size= Integer.parseInt(reader.readLine());
	        
int[] arrival= new int[size];
	 
       int[] depatrure=new int[size];
	  
      String[] a= reader.readLine().split(" ");
	        
String[] b= reader.readLine().split(" ");
	      
  for(int i=0;i<size;i++){
	        
    arrival[i]= Integer.parseInt(a[i]);
	       
     depatrure[i]= Integer.parseInt(b[i]);}
	           
 Arrays.sort(arrival);
	
            Arrays.sort(depatrure);

	            int plat_req=1, result=1;

	            int index_arr=1,index_dep=0;
	            
while(index_arr<size && index_dep<size){
	         
       if(arrival[index_arr]<=depatrure[index_dep]){
	               
 plat_req++;
	                
index_arr++;
	                
	               
 if(plat_req>result){
	                 
   result=plat_req;
	        
        }
	 
               }else{
	                 
   plat_req--;
	                   
 index_dep++;
	                }
	                
	            }
	           
	            
	            
	            
	       
  System.out.println(result); }
	     
	        
	    
		//code
	}
}