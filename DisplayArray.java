package tutorial3;
import java.util.Scanner;
public class DisplayArray {
    public static void main(String[] args) {
        int[] numbers=new int[10];
        int n;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements");
        n=sc.nextInt();
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
           numbers[i]=sc.nextInt();
        }
        System.out.print("original array:");
        for(int i=0;i<n;i++){
            System.out.print(numbers[i] +" ");
        }
        System.out.println("\n reversed array:");
        for(int i=n-1;i>=0;i--){
            System.out.print(numbers[i]+" ");
        }
}
}
