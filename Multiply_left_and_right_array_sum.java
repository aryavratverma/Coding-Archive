/* Pitsy needs help in the given task by her teacher. The task is to divide a array into two sub array (left and right) containing n/2 elements each and do the sum of the subarrays and then multiply both the subarrays.*/



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		int c=Integer.parseInt(reader.readLine());
		while(c!=0){
		    c--;
		    int size= Integer.parseInt(reader.readLine());
		    int[] arr=new int[size];
		    String[] b= reader.readLine().split(" ");
		    for(int i=0;i<size;i++){
		        arr[i]= Integer.parseInt(b[i]);
		        
		    }
		    int temp_size=(int)size/2;
		    int sub_array1=0;
		    for(int i=0;i<temp_size;i++){
		        sub_array1=sub_array1+arr[i];
		    }
		    int sub_array2=0;
		    for(int i=temp_size;i<size;i++){
		        sub_array2=sub_array2+arr[i];
		    }
		    
		    System.out.println(sub_array1*sub_array2);
		}
	}
}
