/*Program to print all Quadruplet present in an array with given sum. Given an unsorted array of integers, print all distinct four elements tuple(Quadruplets) in it having given sum

Input Format

Take the array elements from the user
Take the sum from the user
Take the array size from the user
Constraints

0 <= num <= 100000
sum > 0
size > 0*/

//source code


import java.io.*;
import java.util.*;

public class Solution {
    public static void combination(int[] a, int size, int sum){
        Arrays.sort(a);
        
        for(int i=0;i<size-4;i++){
            for(int j=i+1;j<size-3;j++){
                int remaining_sum=sum-(a[i]+a[j]);
                
                int lower_bound= j+1;
                int upper_bound=size-1;
                while(lower_bound<upper_bound){
                    if((a[lower_bound]+a[upper_bound])< remaining_sum)
                        lower_bound++;
                    else if((a[lower_bound]+a[upper_bound])> remaining_sum)
                        upper_bound--;
                    else{
                        System.out.println(a[i]+" "+a[j]+" "+a[lower_bound]+" "+a[upper_bound]);
                        break;
                    }
                    
                }
                
                
            }
        }
         
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(reader.readLine());
        String[] str= reader.readLine().split(" ");
        int sum= Integer.parseInt(reader.readLine());
        int[] a= new int[size];
        for(int i=0;i<size;i++){
            a[i]=Integer.parseInt(str[i]);
        }
        combination(a, size, sum);
        
        
    }
}