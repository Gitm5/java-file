package tutorial3;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int n,lar,min;
        
        
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements");
        n=sc.nextInt();
        int[] numbers=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
           numbers[i]=sc.nextInt();
        }
        lar=numbers[0];
        for(int i=0;i<n;i++){
            if(lar<numbers[i]){
                lar=numbers[i];

            }
        }
        min=numbers[0];
        for(int i=0;i<n;i++){
            if(min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("largest number:"+lar);
        System.out.println("smallest number:"+min);
        

    }
}
