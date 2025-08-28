package tutorial3;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] numbers=new int[10];
        int n,key;
        boolean element=false;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements");
        n=sc.nextInt();
        System.out.println("enter the number to be searched:");
        key=sc.nextInt();
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
           numbers[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(key==numbers[i]){
                System.out.println("searched number:"+key);
                System.out.println("position of searched number:"+i); 
                element=true;
            }
          
        }

          if(element==false){
            System.out.println("Match not found");
          }

    }
}
