package string;

import java.util.Scanner;

/**
 *
 * @author sakshi
 */
public class Stack {
    
    
         int top;
         int capacity;
         char[] arr;

        public Stack(int capacity) {
            this.capacity = capacity;
            this.arr=new char[capacity];
            this.top=-1;
            
        }
        
        
        public void push(char value){
            arr[++top]=value;
        }
        
        public char pop(){
            return arr[top--];
        }
        
        public static String reverse(String str){
            
            char[] carr=str.toCharArray();
            int size=carr.length;
            Stack stack=new Stack(size);
            
            int i;
            for(i=0;i<size;++i){
                stack.push(carr[i]);
            }
            char[] arr=new char[size];
            for(i=0;i<size;++i){
               arr[i]= stack.pop();
            }
            //System.out.println(arr);
            
            
            return String.valueOf(arr);
        }
        
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the string");
            String s=sc.nextLine();
            String rev=Stack.reverse(s);
            System.out.println(rev);
            if(s.equals(rev))
                System.out.println("palindrom");
            else
                System.out.println("not palindrom");
        }
}
