import java.util.Scanner;

public class ReverseNumber {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,n,reverse=0,num,digit;
        System.out.println("enter a number");
        n=sc.nextInt();
         for (  num = n; num > 0; num = num / 10) {
             digit = num % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("number after reversing:"+reverse);

    }
}
