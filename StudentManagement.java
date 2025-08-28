package tutorial7;

import java.util.Scanner;

class student {
    String name;
    int rollno;
    String course;

    student(String name, int rollno, String course) {
        this.name = name;
        this.rollno = rollno;
        this.course = course;
    }

    void set_details(Scanner sc) {
        System.out.println("Enter the name:");
        name = sc.nextLine();

        System.out.println("Enter the roll no:");
        rollno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the course:");
        course = sc.nextLine();
    }

    void display_details() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends student {
    int CollegeFee;

    StudentAccount(String name, int rollno, String course, int CollegeFee) {
        super(name, rollno, course);
        this.CollegeFee = CollegeFee;
    }

    void set_fee(Scanner sc) {
        System.out.println("Enter the college fee:");
        CollegeFee = sc.nextInt();
    }

    void display_fee() {
        System.out.println("College Fee: " + CollegeFee);
    }
}

class Hosteller extends StudentAccount {
    int hostelFee, messFee;

    Hosteller(String name, int rollno, String course, int CollegeFee) {
        super(name, rollno, course, CollegeFee);
    }

    void set_hostel_details(Scanner sc) {
        System.out.println("Enter hostel fee:");
        hostelFee = sc.nextInt();
        System.out.println("Enter mess fee:");
        messFee = sc.nextInt();
    }

    void display_hostel_details() {
        display_details();
        display_fee();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        int total = CollegeFee + hostelFee + messFee;
        System.out.println("Total Fee : " + total);
    }
}

class DayScholar extends StudentAccount {
    int busFee;

    DayScholar(String name, int rollno, String course, int CollegeFee) {
        super(name, rollno, course, CollegeFee);
    }

    void set_bus_details(Scanner sc) {
        System.out.println("Enter bus fee:");
        busFee = sc.nextInt();
    }

    void display_bus_details() {
        display_details();
        display_fee();
        System.out.println("Bus Fee: " + busFee);
        int total = CollegeFee + busFee;
        System.out.println("Total Fee : " + total);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String name = "",course = "";
      int rollno = 0,CollegeFee = 0;
        System.out.println("---- Enter Hosteller Details ----");
        Hosteller hs = new Hosteller( name,  rollno,  course,  CollegeFee); 
        hs.set_details(sc);
        hs.set_fee(sc);
        hs.set_hostel_details(sc);

        System.out.println("---- Enter Day Scholar Details ----");
        sc.nextLine();
        DayScholar ds = new DayScholar( name, rollno,  course,  CollegeFee);
        ds.set_details(sc);
        ds.set_fee(sc);
        ds.set_bus_details(sc);

        System.out.println("\n----- Hosteller Details -----");
        hs.display_hostel_details();

        System.out.println("\n----- Day Scholar Details -----");
        ds.display_bus_details();

        
    }
}
