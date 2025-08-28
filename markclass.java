
package tutorial4;

import java.util.Scanner;

 class Mark {
    float mark1;
    float mark2;
    float mark3;
    Mark(float m1,float m2,float m3){
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    void dispalytotal(){
      System.out.print("total marks:"+(mark1+mark2+mark3));
    }
    void displayaverage(){
      System.out.print("\naverage mark:"+(mark1+mark2+mark3)/3);
    }
}


public class markclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      float m1,m2,m3;
       int i,n;
       System.out.println("enter the no of students:");
       n=sc.nextInt();
       sc.nextLine();
       Mark[] Marks=new Mark[n];
       for(i=0;i<n;i++){
        System.out.println("ENTER THE MARKS OF STUDENT"+(i+1));
        System.out.print("enter the marks of 1st subject:");
        m1=sc.nextFloat();
         
         System.out.print("enter the marks of 2nd subject:");
        m2=sc.nextFloat();
         System.out.print("enter the marks of 3rd subject:");
        m3=sc.nextFloat();
        sc.nextLine();
         
         Marks[i] = new Mark(m1, m2, m3);
       }

     
       for(i=0;i<n;i++){
        System.out.println("\nStudent " + (i + 1) + ":");
        Marks[i].dispalytotal();
        Marks[i].displayaverage();
       }
        
         
        

    }
}
