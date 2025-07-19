import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the number");
        a=sc.nextInt();
        System.out.println("enter the number");
        b=sc.nextInt();
        System.out.println("enter the number");
        c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("largest:"+a);
            }
           
        }
        else if (b>c){
            System.out.println("largest:"+b);

        }
        else{
            System.out.println("largest:"+c);
        }
    }
    
}
