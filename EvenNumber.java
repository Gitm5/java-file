import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int i=1;
       System.out.println("all even numbers:\n");
       do{
        if(i%2==0){
           System.out.print(i+" ");
            
        }
        i++;
       

        }while(i<=20);
       
    }
}