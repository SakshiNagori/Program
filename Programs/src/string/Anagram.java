package string;

import java.util.Scanner;

/**
 *
 * @author sakshi
 */
public class Anagram {
    
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st string");
        String s1=sc.nextLine();
        System.out.println("enter 2nd string");
        String s2=sc.nextLine();
        
        boolean isAnagram=true;
        int a[]=new int[256];
        int b[]=new int[256];
        
        for(char c:s1.toCharArray()){
            int index=(int)c;//store the ascii value corresponding to the char
            a[index]++;
        }
        
        for(char c:s2.toCharArray()){
            int index=(int)c;
            b[index]++;
            
        }
        for (int i = 0; i < 256; i++) {
            if(a[i]!=b[i])
            {
                 isAnagram=false;
                 break;
            }
            
        }
        if(isAnagram)
            System.out.println("anagram");
        else
            System.out.println("not anagram");
        
    }
    
    
}
