package searching;

import java.util.Scanner;

//time com=o(n)

public class Linear {
        
        public static int LinerSearch(int arr[],int ele){
        //    int result=-1;
            int n=arr.length;
            for(int i=0;i<n;i++){
                if(arr[i]==ele)
                    return i;
            }

            return -1;
}
        
        

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter all the elements");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("enter element ypu want to search");
        int x=sc.nextInt();
        int result=LinerSearch(a, x);
        if(result==-1)
            System.out.println("element not found");
        else
            System.out.println("element found at index"+result);
        
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i]);
//            
//        }
    }
    
}
