package tutorial5;

import java.util.Scanner;
import java.util.Vector;

public class SearchVector {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Vector<String> item = new Vector<String>();

      
        item.add("pen");
        item.add("Notebook");
        item.add("Eraser");
        item.add("Marker");
        
         System.out.print("enter the item to be searched:");
         String it=sc.next();
        
        
        
            if(item.contains(it)){
                System.out.println("item found");

            }
            else{
                System.out.println("item not found");
            }
        }
    }
    

