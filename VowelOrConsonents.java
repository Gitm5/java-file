package tutorial2;

import java.util.Scanner;



public class VowelOrConsonents {



     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char chara;
        System.out.println("enter the letter");
        chara=sc.next().charAt(0);
        switch (chara) {
            case 'a','e','i','o','u','A','E','I','O','U':
            
            System.out.println("the letter is a vowel");
             break;
            
            default:
            if((chara>='a'&& chara<='z')||chara>='A'&& chara<='Z'){
            System.out.println("the letter is a consonent");
            }
            else{
                System.out.println("enter a letter as input");
            }
                break;
        }


     }
}
