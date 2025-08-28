package tutorial5;

import java.util.Vector;

public class SumVector {
      public static void main(String[] args) {

      Vector<Integer> Numbers = new Vector<Integer>();
      int sum =0;
      
       Numbers.add(10);
        Numbers.add(20);
        Numbers.add(30);
        Numbers.add(40);
       Numbers.add(50);
       System.out.println("sum of numbers:");
    for (Integer items: Numbers) {
         sum+=items;
           
      }
       System.out.println(sum);
}
}
