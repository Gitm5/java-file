package tutorial3;

import java.util.Scanner;

public class SumAndAverage {
      public static void main(String[] args) {
        int n,sum=0;
         double avg;
        
        
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements");
        n=sc.nextInt();
        int[] numbers=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
           numbers[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=numbers[i];
            
            
        }
        avg=sum/n;
        
        System.out.println("sum of the array elements:"+sum);
        System.out.println("average of the array elements:"+avg);
    }
}
