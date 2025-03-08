import java.util.Scanner;
import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printDetails() {
        System.out.println(getTitle() + " " + getPrice());
    }
}

class Library {
    private ArrayList<Book> storedBooks;

    public Library() {
        storedBooks = new ArrayList<>();
    }

    public void addBook(Book b) {
        storedBooks.add(b);
    }

    public void printAllBooks() {
        for (Book book : storedBooks) {
            book.printDetails();
        }
    }

    public Book filterBooks(String name) {
        for (Book book : storedBooks) {
            if (book.getTitle().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null; // If no book is found
    }

    public ArrayList<Book> filterBooks(double price) {
        ArrayList<Book> filteredBooks = new ArrayList<>();
        for (Book book : storedBooks) {
            if (book.getPrice() < price) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }
}

public class SetA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Books: ");
        int books = sc.nextInt();
        sc.nextLine();  // To consume the newline character left after nextInt()

        Library library = new Library();

        for (int i = 0; i < books; i++) {
            System.out.println("Enter Book Title: ");
            String title = sc.nextLine();

            System.out.println("Enter Book Author: ");
            String author = sc.nextLine();

            System.out.println("Enter Book Price: ");
            double price = sc.nextDouble();
            sc.nextLine();  // To consume the newline character left after nextDouble()

            Book b = new Book(title, author, price);
            library.addBook(b);
        }

        // Print all books
        System.out.println("All Books in Library:");
        library.printAllBooks();

        // Example of filtering books by price
        System.out.println("Enter price to filter books cheaper than that: ");
        double filterPrice = sc.nextDouble();
        ArrayList<Book> filteredBooks = library.filterBooks(filterPrice);

        System.out.println("Books cheaper than " + filterPrice + ":");
        for (Book book : filteredBooks) {
            book.printDetails();
        }

        // Example of filtering books by title
        System.out.println("Enter title to filter books with that title: ");
        sc.nextLine();  // Consume the leftover newline
        String filterTitle = sc.nextLine();
        Book filteredBook = library.filterBooks(filterTitle);

        if (filteredBook != null) {
            System.out.println("Found Book: ");
            filteredBook.printDetails();
        } else {
            System.out.println("No book found with that title.");
        }

        sc.close();
    }
}
