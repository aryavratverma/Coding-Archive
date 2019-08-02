import java.io.*;


class BubbleSort {

    public static void insertionSort(int[] arr, int size){
      
  for(int i=1;i<size-1;++i){
         
   int temp=arr[i];
         
   int j=i-1;
        
    while(j>=0 && temp<arr[j]){
           
     arr[j+1]=arr[j];
             
   j=j-1;
         
   }
            
arr[j+1]=temp;
            
            
        }
        
        
        
        
        
	for(int k=0;k<size;k++){
            System.out.print(arr[k]+" ");}
       
 
   
        
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
	
	}
}