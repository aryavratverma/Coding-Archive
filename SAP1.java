/*WAp to reverse all characters of string of each word in a given input string and capatilize the first letter of each word in the 
output String also keepint the other words in lower case

Input=Hello world
output= Olleh Dlrow

input=are you sure you don't want to come for the party?
output= Erus Uoy T'nod Tnaw Ot Emoc Rof Eht ?ytrap

*/


import java.io.*;

import java.lang.*;

import java.util.*;


class GFG {
	
public static void main (String[] args) throws IOException {
	 
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 
   String str= reader.readLine();
	 
   char[] a= str.toCharArray();
	 
   int len=a.length;
	
    a[0]=Character.toLowerCase(a[0]);
	 
   a[len-1]=Character.toUpperCase(a[len-1]);
	 
   for(int i=0;i<len;i++){
	     
   if(a[i]==' '){
	        
    a[i+1]=Character.toLowerCase(a[i+1]);
	         
   a[i-1]=Character.toUpperCase(a[i-1]);
	
        }
	    }
	    
	
    Stack<Character> stk = new Stack<Character>();
	 
   for(int i=0;i<len;i++){
	      
  if(a[i]==' '){
	      
      while(stk.empty()!=true){
	               
 System.out.print(stk.pop());
	          
  }
	           
 System.out.print(" ");
	        
}else{
	    
        stk.push(a[i]);
	 
       }
	    }
	  
  while(stk.empty()!=true){
	     
   System.out.print(stk.pop());
	       
 
	    }
	}}