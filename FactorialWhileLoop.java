import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,i=1,fac=1;
        System.out.println("enter the number");
        n=sc.nextInt();
        while (i<=n) {
            fac=fac*i;
            i++;
            
        }
        System.out.println("factorial of the number:"+fac);

    }
}
