package tutorial8;
class Bird {
    void fly() {
        System.out.println("Bird is flying in the sky.");
    }
}

class Sparrow extends Bird {
    
    void fly() {
        System.out.println("Sparrow flies short distances.");
    }
}

class Eagle extends Bird {
   
    void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

public class MethodOverridingbird {
    public static void main(String[] args) {
       
        Bird b1 = new Bird();
        Bird b2 = new Sparrow();
        Bird b3 = new Eagle();

        
        b1.fly();  
        b2.fly();  
        b3.fly();  
    }
}
