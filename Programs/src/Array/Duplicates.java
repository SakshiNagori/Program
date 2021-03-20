package Array;

public class Duplicates {

    void repeat(int a[],int size){
        int i;
        int count[]=new int[size];
        for(i=0;i<size;i++){
            if(count[a[i]]==1)
                System.out.println(a[i]+"  "+ count[a[i]]);
            else
                count[a[i]]++;
        }
        
    }
    
    public static void main(String[] args) {

        int a[] = {1, 5, 6, 7, 5, 1, 9};
        int size=a.length-1;
        int i;
//        for (i = 0; i < a.length; i++) {
//            for (j = i + 1; j < a.length; j++) {
//                if (a[i] == a[j]) {
//                    System.out.println("Duplicate No. is " + a[i]);
//                    
//                }
//                
//            }//break; (if we want to find the first reprating element)
//        }
        
    Duplicates d=new Duplicates();
    d.repeat(a, size);
        
    }

}
