package string;

import java.util.Scanner;

/**
 *
 * @author sakshi
 */
public class CountOccurance {
    
    public static void main(String[] ars){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        s=s.replace(" ", "");
        int count=0,len=0;
        do {            
            char name[]=s.toCharArray();
            len=name.length;
            count=0;
            for (int i = 0; i < len; i++) {
                if(name[0]==name[i])
                    count++;
                
            }
            if(count!=0)//count>1 if we want to print duplicate char
                    System.out.println(name[0]+" : "+count);
             s=s.replace(""+name[0], "");
        } while (len!=1);
    }
}
