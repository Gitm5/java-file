package tutorial3;

import java.util.Scanner;

public class OddEvenCount {
    
    public static void main(String[] args) {
        int[] numbers=new int[10];
        int n,even=0,odd=0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements");
        n=sc.nextInt();
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
           numbers[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(numbers[i]%2==0){
                 even++;
            }
            else{
                odd++;
            }

        }
        System.out.println("number of even:"+even);
        System.out.println("number of odd:"+odd);
    }
}
