/*Given two numbers A and B. The task is to find out their LCM and GCD.

Input:
The first line of input contains an integer T denoting the number of testcases. T testcases follow. In each test cases, there are two numbers A and B separated by space.

Output:
For each testcase in a new line, print LCM and GCD separated by space.

Constraints:
1 <= T <= 104
1 <= A <= 108
1 <= B <= 108

Example:
Input:
2
5 10
14 8

Output:
10 5
56 2

Explanation:
Testcase 1: LCM and GCD of given numbers 5 and 10 are: 10 and 5.*/



import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

     static int gcd(int a,int b){

        if(a==0 || b==0){

            return 0;
        }
 
       if(a==b){return a;}

        
        if(a>b){return gcd(a-b,b);

            
        }else{
 
           return gcd(a,b-a);
      
  }}


     static int lcm(int a,int b){
          
  return (a*b)/gcd(a,b);
   
     }

    
	
public static void main(String[] args) throws IOException {

		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	
	int t= Integer.parseInt(reader.readLine());
		
for(int i=0;i<t;i++){

		String[] str= reader.readLine().split(" ");
		
int a=Integer.parseInt(str[0]);

		int b=Integer.parseInt(str[1]);

		
		int res_gcd=gcd(a,b);
		
int res_lcm=lcm(a,b);
	
	System.out.println(res_lcm+" "+res_gcd);
		    
	
	}
		
	}
}