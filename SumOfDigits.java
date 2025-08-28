package tutorial2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,temp,nod,digit,sum;
        
        System.out.println("enter the number");
        n=sc.nextInt();
        //4-digit checking
            
        temp=n;
           nod=0;
        while(temp>0){ 
            temp=temp/10;       
            nod++;
        }
       //validating and taking sum of 4 digit number
        if(nod==4){
        
            sum=0;
     while(n>0){
                 digit=n%10;
                 sum+=digit;
                 n=n/10;
                
            }
            System.out.print("sum of digit:"+ sum); 
        }
        else{
            System.out.println("pls input 4-digit number");
        }
    
    
    }
}
