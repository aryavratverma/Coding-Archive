/*Given an integer, check whether it is Bleak or not.

A number ‘n’ is called Bleak if it cannot be represented as sum of a positive number x and set bit count in x, i.e., x + countSetBits(x) is not equal to n for any non-negative number x.*/

import java.io.*;


class GFG {

    static int countBits(int x){
     
   int count=0;
     
   while(x!=0){
          
  x=x&(x-1);
        
    count++;
        }
    
    return count;
    }
    
    
static boolean isBleak(int num){
     
   for(int i=1;i<num;i++)
           
 if((i+countBits(i))==num)
            
    return false;
      
  return true;        
           
        
    }

	public static void main (String[] args)throws IOException {

		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	
	int num=Integer.parseInt(reader.readLine());

		if(isBleak(num)){

		    System.out.println(1);
		    

		}else{

		    System.out.println(0);
		}
		
	}
}