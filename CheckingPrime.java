import java.util.Scanner;

public class CheckingPrime {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int j,num;
        
        System.out.println("enter a number");
        num=sc.nextInt();
        boolean cprime=true;
        if(num<=1){
              cprime=false;

        }
        else{
            
            for(j=2;j<=num/2;j++){
                
            if(num%j==0){
                cprime=false;
                break;
            

            }
        }

        }
     
    
     if(cprime){
        System.out.println(+ num + " is a prime number");
     }
     else{
        System.out.println(+ num + " is not a prime number");
     }
    }
}


