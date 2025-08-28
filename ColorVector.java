package tutorial5;

import java.util.Vector;

public class ColorVector {
     public static void main(String[] args) {

      Vector<String> color = new Vector<String>();

      
       color.add("red");
       color.add("green");
       color.add("blue");
       color.add("yellow");

        
        System.out.println("List of colors:");
        for (String items: color) {
            System.out.println(items);
        }
        color.remove("green");
        System.out.println("after removing green:");
        for (String items: color) {
            System.out.println(items);
        }
    }
}

