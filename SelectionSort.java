import java.io.*;


class SelectionSort {
    
public static void selectionSort(int[] arr, int size){
  
      for(int i=0;i<size;i++){
           
 int min_index=i;
            
for(int j=i+1;j<size;j++){
              
  if(arr[j]<arr[min_index])
   
             
    min_index=j;
           
 }
         
   int temp=arr[i];
            
arr[i]=arr[min_index];
         
   arr[min_index]=temp;

            }
    
    
        
        
        
       
    
     
   
    }
	
public static void main (String[] args)throws IOException {

		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	
	int size= Integer.parseInt(reader.readLine());
		
int[] arr=new int[size];
		
String[] a= reader.readLine().split(" ");
		
for(int i=0;i<size;i++){
		    
arr[i]= Integer.parseInt(a[i]);
	
	    
		}
		 
selectionSort(arr, size); 
		
		
        	
for(int k=0;k<size;k++)
{
            
System.out.print(arr[k]+" ");
}
	
	}
}