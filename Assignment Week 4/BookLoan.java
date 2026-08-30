import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String bookCode;
    private boolean loaned;

    public Book(String title, String author, String bookCode) {
        if (title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Invalid title");

        if (author == null || author.trim().isEmpty())
            throw new IllegalArgumentException("Invalid author");

        if (bookCode == null || bookCode.trim().isEmpty())
            throw new IllegalArgumentException("Invalid book code");

        this.title = title;
        this.author = author;
        this.bookCode = bookCode;
        loaned = false;
    }

    public boolean borrowBook() {
        if (loaned)
            return false;

        loaned = true;
        return true;
    }

    public boolean returnBook() {
        if (!loaned)
            return false;

        loaned = false;
        return true;
    }

    public boolean isAvailable() {
        return !loaned;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookCode() {
        return bookCode;
    }

    public String toString() {
        return "Title: " + title +
               ", Author: " + author +
               ", Code: " + bookCode +
               ", Available: " + isAvailable();
    }
}

public class BookLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title1 = sc.nextLine();

        System.out.print("Enter author: ");
        String author1 = sc.nextLine();

        System.out.print("Enter book code: ");
        String code1 = sc.nextLine();

        Book b1 = new Book(title1, author1, code1);

        System.out.print("\nEnter second book title: ");
        String title2 = sc.nextLine();

        System.out.print("Enter second author: ");
        String author2 = sc.nextLine();

        System.out.print("Enter second book code: ");
        String code2 = sc.nextLine();

        Book b2 = new Book(title2, author2, code2);

        System.out.println("\n" + b1);
        System.out.println(b2);

        System.out.println("\nBorrow first book: " + b1.borrowBook());
        System.out.println("Borrow first book again: " + b1.borrowBook());

        System.out.println("Return first book: " + b1.returnBook());
        System.out.println("Return first book again: " + b1.returnBook());

        System.out.println("\nFinal:");
        System.out.println(b1);
        System.out.println(b2);

        sc.close();
    }
}
