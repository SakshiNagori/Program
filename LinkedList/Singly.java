package LinkedList;

import java.util.Scanner;

/**
 *
 * @author sakshi
 */
public class Singly {
    
    class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public Node head=null;
    public Node tail=null;
    
    public void addNode(int data){//at end
        
        Node newNode=new Node(data);
        if(head==null){//then head and tail will point to new node
            head=newNode;
            tail=newNode;
        } else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    
    public void addAtstart(int data){
        
         Node newNode=new Node(data);
        if(head==null){//then head and tail will point to new node
            head=newNode;
            tail=newNode;
        } else{
            Node temp=head;
            head=newNode;
            head.next=temp;
        }
    }
    
    public void printList(){
        Node current=head;
        
        if(head==null)
            System.out.println("list is empty");
      //  int count=0;
        System.out.println("nodes are::::");
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
       //     count++;        
        }
      //  System.out.println("length of linked list is::"+count);
    }
    
    public void searchNode(int data){
        
        Node current=head;
        int i=0;
        if(head==null)
            System.out.println("list is empty");
        boolean found=false;
        while(current!=null){
            if(current.data==data){
                found=true;
                break;
            }
            i++;
            current=current.next; 
            
        }
        if(found)
            System.out.println("element found at "+i );
        else
            System.out.println("not found");
                    
    }
    
    public void deletion(int pos){
        
        if(head==null)
            return;
        
        Node temp=head;
        
        if(pos==0){
            head=temp.next;
            return;
        }
        
        for(int i=0;i<pos-1&&temp!=null;i++){
            temp=temp.next;
            } 
            Node nextNode=temp.next.next;
            temp.next=nextNode;
            
       
    }
    
     public void maxNode(){
        
        Node current=head;
        int max=head.data;
        
        while(current!=null){
            if(max<current.data){
                max=current.data;
            }
            current=current.next;
        }
        System.out.println("max node is::"+max);
    }
   public void minNode(){
        
        Node current=head;
        int min=head.data;
        
        while(current!=null){
            if(min>current.data){
                min=current.data;
            }
            current=current.next;
        }
        System.out.println("min node is::"+min);
    }
   
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        Singly s=new Singly();
        System.out.println("enter no of nodes");
        int n=sc.nextInt();
        System.out.println("enter data");
        for (int i = 1; i <= n; i++) {
            int x=sc.nextInt();
            s.addNode(x);
           // s.addAtstart(x);
            
        }
        s.printList();
        System.out.println();
        //System.out.println("enter position of node to be delete");
        int e=sc.nextInt();
      //  s.searchNode(e);
        //s.deletion(e);
        //s.printList();
        s.maxNode();
        s.minNode();
    }
    
    
}
