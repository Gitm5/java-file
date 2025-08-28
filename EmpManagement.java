package tutorial7;

import java.util.Scanner;

class employee{
        String name;
        String address;
        int age;
        int mob;
        float sal;


        employee( String name,String address,int age,int mob,float sal){
                 this.name=name;
         this.address=address;
        this.age=age;
        this.mob=mob;

         this.sal=sal;
        }
        void print_salary(){
            System.out.println("salary:"+sal);
        }
    }
    class officer extends employee{
     String spl;
        officer(String name, String address, int age, int mob, float sal,String spl) {
            super(name, address, age, mob, sal);
           this.spl=spl;
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mob);
        System.out.println("Salary: " + sal);
        }
        void print_specialisation(){
            System.out.println("specialisation:"+spl);
        }
    }
    class manager extends employee{
        String dep;
        manager(String name, String address, int age, int mob, float sal,String dep) {
            super(name, address, age, mob, sal);
            this.dep=dep;
            System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mob);
        System.out.println("Salary: " + sal);
        }
        void print_dept(){
            System.out.println("departement:"+dep);
        }
    }

public class EmpManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age,mob;
        float sal;
        String name ,add;
        String spl;
        String dep;
        System.out.println("officer");
        System.out.println("enter officer's name:");
        name=sc.nextLine();
        System.out.println("enter address:");
        add=sc.nextLine();
        System.out.println("enter age:");
        age=sc.nextInt();
        System.out.println("enter mobile number:");
        mob=sc.nextInt();
  System.out.println("enter salary:");
        sal=sc.nextFloat();
         sc.nextLine();
          System.out.println("enter specialisation:");
        spl=sc.nextLine();

         System.out.println("manager");
        System.out.println("enter Manager's name:");
        name=sc.nextLine();
        System.out.println("enter address:");
        add=sc.nextLine();
        System.out.println("enter age:");
        age=sc.nextInt();
        System.out.println("enter mobile number:");
        mob=sc.nextInt();
  System.out.println("enter salary:");
        sal=sc.nextFloat();
         sc.nextLine();
         System.out.println("enter departement:");
        dep=sc.nextLine();
     System.out.println("-------officer's detail-------");
        officer of=new officer(name, add, age, mob, sal,spl);
        of.print_specialisation();
        System.out.println("-------manager's detail-------");
          manager ma= new manager(name, add, age, mob, sal, dep);
       ma.print_dept();
    }
}
