package tutorial3;
import java.util.Arrays;
import java.util.Scanner;
public class sort {
     public static void main(String[] args) {
        int n;
        
        
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements");
        n=sc.nextInt();
        int[] numbers=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
           numbers[i]=sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("the sorted array:");
        for(int elements:numbers){
            System.out.print(elements+" ");

        }
    }
}
