package Array;

import java.util.Scanner;

/**
 *
 * @author sakshi
 * 
 */
public class moreThanNdivK {
    
    static class elecount{
        int e;
        int c;
    };
    
    static void element(int arr[],int n,int k){
        if(k<2){
            return;
        }
        
        //create an arr of sixe k-1 to store all elements and its count
        elecount []temp=new elecount[k-1];
        for (int i = 0; i < k-1; i++) {
            temp[i]=new elecount();
            temp[i].c=0;
        }
        
        for (int i = 0; i < n; i++) {
            int j;
            //if arr[i] is present than increase its count
            for(j=0;j<k-1;j++){
                if(temp[j].e==arr[i]){
                    temp[j].c+=1;
                    break;
                }
            }
            
            //if arr[i] is not present
            if(j==(k-1)){
                int l;
                //if position avail in temp[]
                for(l=0;l<k-1;l++){
                    if(temp[l].c==0){
                        temp[l].e=arr[i];
                        temp[l].c=1;
                        break;
                    }
                }
                
                 //if position is not avail in temp[]
                 if(l==k-1){
                     for(l=0;l<k-1;l++){
                         temp[l].c-=1;
                     }
                 }
            }
        }
        for(int i=0;i<k-1;i++){
            int count=0;
            for (int j = 0; j < n; j++) {
                if(arr[j]==temp[1].e)
                    count++;
            }
            if(count>n/k){
                System.out.println("number: "+temp[i].e+"  count:"+temp[i].c);
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter all the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the value of k");
        int k=sc.nextInt();
        
        element(a, n-1, k);
    }
    
    
}
