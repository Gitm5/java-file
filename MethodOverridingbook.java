package tutorial8;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Technical extends Book {
    String subject;

    Technical(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

   
    void display() {
        System.out.println("Technical Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

class Story extends Technical {
    String genre;

    Story(String title, String author, String subject, String genre) {
        super(title, author, subject);
        this.genre = genre;
    }

    
    void display() {
        System.out.println("Story Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject : " + subject);
        System.out.println("Genre: " + genre);
    }
}

public class MethodOverridingbook {
    public static void main(String[] args) {
        Book b; 

        b = new Book("Wings of Fire", "A.P.J. Abdul Kalam");
        b.display();

        System.out.println();

        b = new Technical("Clean Code", "Robert C. Martin", "Computer Science");
        b.display();

        System.out.println();

        b = new Story("Alchemist", "Paulo Coelho", " Literature", "Philosophy");
        b.display();
    }
}

