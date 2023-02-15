package class19;

public class Book {
    /*
    Write book class that will have instance variables and 2 Constructors .
    While creating and object make sure instance variables are being initialized
     Both Constructors are being executed
     */

    String author;
    String title;
    int year;

    Book(String author,String title){
        this.author=author;
        this.title=title;

    }
    Book(String author,String title,int year){
        this(author,title);
        this.year=year;

    }
    void info(){
        System.out.println("Author "+author+", Title: "+title+", published: "+year);
    }

    public static void main(String[] args) {
        Book book=new Book("Judy Kerolus", "Java Principle",2023);
        book.info();
    }
}
