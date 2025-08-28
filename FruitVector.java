package tutorial5;

import java.util.Vector;



public class FruitVector {

      public static void main(String[] args) {
        
        Vector<String> fruits = new Vector<String>();

      
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        
        System.out.println("List of Fruits:");
        for (String items: fruits) {
            System.out.println(items);
        }
    }
}
