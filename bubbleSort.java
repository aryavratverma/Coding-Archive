import java.io.*;


class BubbleSort {

public static void bubbleSort(int[] arr, int size){
   
 for(int i=0;i<size;i++){
     
   for(int j=0;j<size-i-1;j++){
         
  	 if(arr[j]>arr[j+1]){
              
 		 int temp=arr[j];
                
			arr[j]=arr[j+1];
                
				arr[j+1]=temp;
           
 }
        }
    }
   
 for(Integer obj:arr){
     
   System.out.print(obj+" ");
    }
}

public static void main (String[] args)throws IOException {
		
	BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

	int size= Integer.parseInt(reader.readLine());

	int[] arr= new int[size];

	String[] a= reader.readLine().split(" ");
		
	for(int i=0;i<size;i++){
		 
   		arr[i]= Integer.parseInt(a[i]);

		    
		}

	bubbleSort(arr,size);

	}
}