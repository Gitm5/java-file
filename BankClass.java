package tutorial4;

import java.util.Scanner;

class bank{
     long accnumber;
    String accholder;
    double balance;

    bank(long accno, String accname, double bal) {
        accnumber = accno;
        accholder = accname;
        balance = bal;
    }
   
    void deposit(double amt){
        if(amt>0){
            balance=balance+amt;
            System.out.println(+amt+ "\tdeposited!");
        }
        else{
            System.out.println("invalid input");
        }
    }
    void displayBank(){
      System.out.println("Account number:"+accnumber);
       System.out.println("Account Holder:"+accholder);
        System.out.println("Balance:"+balance);
    }
}


      public class BankClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String acchol;
       double  bal ;
       long accno;
       
       
      
         System.out.print("enter the account number:");
        accno=sc.nextLong();
        sc.nextLine();
      
        System.out.print("enter the account holder name:");
        acchol=sc.nextLine();
          System.out.print("enter the balnce:");
        bal=sc.nextDouble();
         
       
         
        sc.nextLine();
         
         bank bank= new bank(accno, acchol,bal);
    
        System.out.println("before deposit:");
        bank.displayBank();
        System.out.println("enter the amount to deposit:");
        double amo=sc.nextDouble();
        bank.deposit(amo);

        System.out.println("after deposit");
        bank.displayBank();


     
      
        
         
        

    }
}


