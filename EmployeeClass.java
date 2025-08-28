package tutorial4;

import java.util.Scanner;

class employee{
    int empid;
    String empname;
    long salary;
    employee(int id,String name,long sal){
        empid=id;
        empname=name;
        salary=sal;
    }
    void displayEmp(){
      System.out.println("employee name:"+empname);
       System.out.println("employee id:"+empid);
        System.out.println("employee salary:"+salary);
    }
}


public class EmployeeClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id1,id2;
        String name1,name2;
        long sal1,sal2;
        System.out.print("enter the employee name:");
        name1=sc.nextLine();
         
         System.out.print("enter the employee id:");
        id1=sc.nextInt();
         System.out.print("enter the employee salary:");
        sal1=sc.nextLong();
        sc.nextLine();



         System.out.print("enter the employee name:");
        name2=sc.nextLine();
       
         System.out.print("enter the employee id:");
        id2=sc.nextInt();
         System.out.print("enter the employee salary:");
        sal2=sc.nextLong();

        employee em1=new employee(id1,name1,sal1);  
         employee em2=new employee(id2,name2,sal2); 
         em1.displayEmp();
         em2.displayEmp();

    }
}
