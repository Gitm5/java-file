package tutorial4;

import java.util.Scanner;

 class Book {
    String title;
    String author;
    float price;

    Book(String ti, String au, float pri) {
        title = ti;
        author = au;
        price = pri;
    }
    void displaybook(){
      System.out.println("title name:"+title);
       System.out.println("author's name:"+author);
        System.out.println("book price:"+price);
    }
}


public class BookClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String ti ,au;
       float pri ;
       int i,n;
       System.out.print("enter the no of books to be listed:");
       n=sc.nextInt();
       sc.nextLine();
       Book[] Book=new Book[n];
       for(i=0;i<n;i++){
        System.out.print("enter the title name:");
        ti=sc.nextLine();
         
         System.out.print("enter the author name:");
        au=sc.nextLine();
         System.out.print("enter the price of the book($):");
        pri=sc.nextFloat();
        sc.nextLine();
         
         Book[i] = new Book(ti, au, pri);
       }

     
       for(i=0;i<n;i++){
        Book[i].displaybook();
       }
        
         
        

    }
}
