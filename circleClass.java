package tutorial4;

import java.util.Scanner;

class circle{
    double radius;
    circle(double r){
        radius=r;
        
    }
    void displayarea(){
        System.out.println("area of the circle:"+3.14*radius*radius);
    }
    void displaycircumference(){
       System.out.println("circumferece of the circle:"+2*3.14*radius);
    }
}


public class circleClass {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r;
        System.out.println("enter the radius:");
        r=sc.nextDouble();
        circle ar=new circle(r);
        circle cir=new circle(r);
       
        ar.displayarea();
       
        cir.displaycircumference();

     }

}
