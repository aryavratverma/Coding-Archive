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
    
  
  public boolean search(Node head, search_key){

        Node ptr= head;
      
  while(ptr!=null){

            if(ptr.data == search_key){

                return true;
                ptr=ptr.next;
     
           
            }
  
      }
        return false;
 
   }
    public static void main(String[] args)throws IOException{
 
       BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        int size= Integer.parseInt(reader.readLine());
 
       LinkedList list= new LinkedList();

        String[] str= reader.readLine().split(" ");

        for(int i=0;i<size;i++){

            list.add(Integer.parseInt(str[i]));
  
          
        }
        int search_key= Integer.parseInt(reader.readLine());
     
   if(list.search(list.head,search_key)){
   
         System.out.println("Element found");

        }else{
   
         System.out.println("Key Not Found");
     
   }
        
        
    }
    
}
