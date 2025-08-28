package tutorial2;
import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n, ispal=0,digit,original;
        System.out.println("enter a number");
        n=sc.nextInt();
       original=n;
        while(n!=0){
            digit=n%10;
            ispal=ispal*10+digit;
            n=n/10;
        }
        if (ispal==original){
            System.out.println("it is pallindromic");

        }
        else{
            System.out.println("it is not pallindromic");
        }
    }
}
