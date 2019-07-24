import java.util.*;

/* Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).




Input:
First line contains an integer T, denoting the number of test cases. First line of each test case contains two space separated integers X and Y, denoting the size of the two sorted arrays. Second line of each test case contains X space separated integers, denoting the first sorted array P. Third line of each test case contains Y space separated integers, denoting the second array Q.

Output:
For each test case, print (X + Y) space separated integer representing the merged array.*/


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
   
         int size2= Integer.parseInt(a[1]);

            String[] b= reader.readLine().split(" ");
    
        String[] c= reader.readLine().split(" ");
 
           int[] b_final= new int[size1];
 
           int[] c_final= new int[size2];

            for(int i=0;i<size1;i++){b_final[i]=Integer.parseInt(b[i]);}
 
           for(int i=0;i<size2;i++){c_final[i]=Integer.parseInt(c[i]);}
   
         int[] mergerdarray= new int[size1+size2];

        
            
            int i=0,j=0,k=0;
    
        while(i<size1 && j<size2){
    
            if(b_final[i]<c_final[j]){
 
                   mergerdarray[k++]=b_final[i++]; 
 
               }else{

                     mergerdarray[k++]=c_final[j++]; 
  
              }}
   
             
                while(i<size1){
  
                   mergerdarray[k++]=b_final[i++];
      
          }
        
        while(j<size2){
 
                  mergerdarray[k++]=c_final[j++];
  
              }
 
               
      
          for(int q=0;q<(size1+size2);q++){

                    System.out.print( mergerdarray[q]+" ");
     
           } 
                
System.out.println();

                
                
            }
        }
	}
