
import java.io.*;


 class Node{

    int data;

    Node next;

    Node(int d){
 
       data=d;

        next=null;
    
}
  
}


public class LinkedList{

    static Node head;

    public void add(int d){

        Node new_node= new Node(d);
 
       new_node.next=head;
 
       head=new_node;

        
    }
  
  
    public static int search(int  key){


         Node ptr = head;

        int counter=0;
 
       while(ptr!=null){
  
          if(counter == key){

                return ptr.data;
  
          }
   
           counter++;
 
               ptr=ptr.next;

                
        }

        return 0;
   
         
        }

        
    
    public static void main(String[] args)throws IOException{
  
      BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
  
      int size= Integer.parseInt(reader.readLine());

        LinkedList list= new LinkedList();
  
      String[] str= reader.readLine().split(" ");
    
    for(int i=0;i<size;i++){
  
          list.add(Integer.parseInt(str[i]));
 
           
        }
  
      int key = Integer.parseInt(reader.readLine());
  
      System.out.println(search(key));  
  
      
    }
    
}