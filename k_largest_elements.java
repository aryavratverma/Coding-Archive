/*Given an array of N positive integers, print k largest elements from the array.  The output elements should be printed in decreasing order.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N and k, N is the size of array and K is the largest elements to be returned. The second line of each test case contains N input C[i].

Output:
Print the k largest element in descending order.

Constraints:
1 = T = 100
1 = N = 100
K = N
1 = C[i] = 1000

Example:
Input:
2
5 2
12 5 787 1 23
7 3
1 23 12 9 30 2 50

Output:
787 23
50 30 23

Explanation:
Testcase 1: 1st largest element in the array is 787 and second largest is 23.
Testcase 2: 3 Largest element in the array are 50, 30 and 23.
 */

/*----Source Code----*/

import java.io.*;


class GFG {
 
   public static void kLargest(int[] temp,int n,int k){  
      for(int i=0; i < n; i++){

          for(int j=1; j < (n-i); j++){

		if(temp[j-1] < temp[j]){

			int temp1 = temp[j-1];
	
			temp[j-1] = temp[j];

			temp[j] = temp1;

				}
}}

      for(int j=0;j<k;j++){

            System.out.print(temp[j]+" ");
           }
     System.out.println("\n");

        
    }
	
public static void main (String[] args) throws IOException{

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       	String[] s = reader.readLine().split(" ");

        int t=Integer.parseInt(s[0]);
        
	while(t!=0){
           
 		t--;
          
  		String[] a = reader.readLine().split(" ");
  
		int n=Integer.parseInt(a[0]);
           
		int k=Integer.parseInt(a[1]);
          
		int[] temp=new int[n];
         
		String[] aux=reader.readLine().split(" ");
      
                for(int j =0;j<n;j++){
              
                    temp[j]= Integer.parseInt(aux[j]);
    
                    }
                
          
                kLargest(temp,n,k);
      
		}}
}