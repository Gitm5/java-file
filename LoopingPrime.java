import java.util.Scanner;

public class LoopingPrime {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j;
        boolean prime;
        System.out.println("prime numbers between 1 to 100 are:");
        for(i=2;i<=100;i++){
             prime=true;
            for(j=2;j<Math.sqrt(i);j++){
            if(i%j==0){
                prime=false;
                break;
            

            }
        }
        if(prime)
             System.out.print(i +" ");
    }
     }
}
