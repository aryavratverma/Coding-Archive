/*Given a binary number, write a program that prints 1 if given binary number is a multiple of 3.  Else prints 0.*/


import java.util.*;
 
import java.lang.*;

import java.io.*;


class BInaryDivisible {

	public static void main (String[] args)throws IOException {
	
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	
    int t= Integer.parseInt(reader.readLine());

	    while(t!=0){

	        t--;

	        String bin= reader.readLine();

	        int dec=Integer.parseInt(bin,2);
	 
       
	        if(dec%3==0){

	        System.out.println(1);}

	        else{
	   
     System.out.println(0);}
	
        
	    }
	    

	    
		//code
	}
}