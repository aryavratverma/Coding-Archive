import java.io.*;


class BubbleSortRecursion {

    public static void insertionSortReacursion(int[] arr, int size){
   
     if(size<=1){
        
    return;
        }
      
  insertionSort(arr,size-1);
        
int last_key=arr[size-1];
        
int j=size-2;
     
   while(j>=0 && arr[j]>last_key){
       
     arr[j+1]=arr[j];
            
j=j-1;
        }
     
   arr[j+1]=last_key;
       
        
        
        
       
    
       
 
    }
	
public static void main (String[] args)throws IOException {

		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		
int size= Integer.parseInt(reader.readLine());

		int[] arr=new int[size];

		String[] a= reader.readLine().split(" ");

		for(int i=0;i<size;i++){
		
    arr[i]= Integer.parseInt(a[i]);

		    
		}
		
insertionSort(arr, size); 
		
		
     
   	for(int k=0;k<size;k++){
            
System.out.print(arr[k]+" ");}
	

	}
}