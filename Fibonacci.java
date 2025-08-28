package tutorial2;


import java.util.Scanner;

public class Fibonacci {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,c,i=1;
        System.out.println("enter the limit");
        n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("fibonacci series :");
        while (i<=n) {
             System.out.print(a + " "); 
            i++;
            c=a+b;
            
            b=a;
            a=c;
           
            

          
        }
        
     }
    
}