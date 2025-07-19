import java.util.Scanner;
public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,sum;
        System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
        sum=a+b;
        System.out.println(sum);
    }
}
