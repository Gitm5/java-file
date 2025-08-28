package tutorial5;

import java.util.Vector;

public class LargestNumber {
    public static void main(String[] args) {

      Vector<Integer> Numbers = new Vector<Integer>();
      
      
      
       Numbers.add(25);
        Numbers.add(60);
        Numbers.add(15);
        Numbers.add(80);
       Numbers.add(40);
      int lar = Numbers.get(0);
        System.out.println("largest number:");
    for (Integer items: Numbers) {
        if(items>lar){
            lar=items;
        }
        
    }
    System.out.println(lar);
}
}
