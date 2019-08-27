import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
	    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	    int c=Integer.parseInt(reader.readLine());
	    while(c!=0){
	        c--;
	        String[] a= reader.readLine().split(" ");
	        
	        int size= Integer.parseInt(a[0]);
	        int k= Integer.parseInt(a[1]);
	        
	        int[] arr=new int[size];
	        String[] str=reader.readLine().split(" ");
	        for(int i=0;i<size;i++){
	            arr[i]=Integer.parseInt(str[i]);
	           }
	           while(k>0){
	               k--;
	               int temp=arr[0];
	               for(int i=0;i<size-1;i++){
	                   arr[i]=arr[i+1];
	               }
	               arr[size-1]=temp;
	           }
	        
	    for(int i=0;i<size;i++){
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	    }
	    
		
	}
}
