import java.util.Scanner;
public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        String fn;
        long mn;
        double att,cgpa,newatt;
        System.out.println("enter full name");
        fn=sc.nextLine();
        System.out.println("enter mobile number");
        mn=sc.nextLong();
        System.out.println("enter age");
        a=sc.nextInt();
        System.out.println("enter cgpa");
        cgpa=sc.nextDouble();
        System.out.println("enter attendance percentage");
        att=sc.nextDouble();
        newatt=att/10;
        System.out.println("StudentDetails:\n");
        System.out.println("Full name:"+fn);
        System.out.println("age:"+a);
        System.out.println("mobile number:"+mn);
        System.out.println("CGPA:"+cgpa);
        if(att>=90){
               System.out.println("attendance percentage:10");
        }
        else{
            System.out.println("attendance percentage:"+newatt);
        }

        


    }
}
