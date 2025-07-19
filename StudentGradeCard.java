import java.util.Scanner;

public class StudentGradeCard {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String fn,grade;
        
        int  marks;
        System.out.println("enter the name");
        fn=sc.nextLine();
         System.out.println("enter the marks");
        marks=sc.nextInt();
         if(marks<=100){
         if(marks>90 && marks<=100){
            System.out.println("the grade is: A");
         }
           
         
         else if(marks>80 && marks<=90){
            System.out.println("the grade is: B");
         }
         else if(marks>70 && marks<=80){
            System.out.println("the grade is: C");
         }
         else if(marks>60 && marks<=70){
            System.out.println("the grade is: D");
         }
         else if(marks>50 && marks<=60){
            System.out.println("the grade is: E");
         }
         else{
            System.out.println("the grade is: F");
         }
        }
        else{
            System.out.println("please enter marks out of 100");
        }
    }
}
