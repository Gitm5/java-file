import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        System.out.println("enter the first number");
        num1=sc.nextInt();
        System.out.println("enter the second number");
        num2=sc.nextInt();
        
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("GCD:"+num1);
    }
    
}
