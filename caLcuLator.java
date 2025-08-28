package tutorial2;

import java.util.Scanner;
public class caLcuLator {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2,ans;
        char operator;
        
        System.out.print("Enter first number: ");
         num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
         num2 = sc.nextDouble();

        
        System.out.print("Enter operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

         

        
        switch (operator) {
            case '+':
                ans = num1 + num2;
                System.out.println("sum: " + ans);
                break;

            case '-':
                ans = num1 - num2;
                System.out.println("difference: " +ans);
                break;

            case '*':
                ans = num1 * num2;
                System.out.println("product:" + ans);
                break;

            case '/':
                if (num2 != 0) {
                    ans = num1 / num2;
                    System.out.println("quotient: " + ans);
                } else {
                    System.out.println(" Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

       
    }
}


