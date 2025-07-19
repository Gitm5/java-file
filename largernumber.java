
import java.util.Scanner;
public class largernumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("enter first number");
        n1=sc.nextInt();
        System.out.println("enter the second number");
        n2=sc.nextInt();
        int largenumber;
        largenumber=n1>n2?n1:n2;
        System.out.println("i am"+largenumber+",the large number");
    }
}