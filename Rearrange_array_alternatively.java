/*Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on...

*/


import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int t= Integer.parseInt(reader.readLine());

	    	while(t!=0){

	        int size= Integer.parseInt(reader.readLine());

	        int[] arr= new int[size];

	        String[] a= reader.readLine().split(" ");

	        for(int i=0;i<size;i++){arr[i]=Integer.parseInt(a[i]);}

	        int newSize=(int)Math.ceil(size/2);

	        for(int j=0;j<newSize;j++){

	            System.out.print(arr[size-j-1]+" "+arr[j]+" ");

	        }

	        System.out.println();

	        t--;

	        
	    }
	}
}