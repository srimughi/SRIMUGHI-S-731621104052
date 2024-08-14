import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private String isbn;
public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
public String getTitle() {
        return title;
    }
public String getAuthor() {
        return author;
    }
public String getIsbn() {
        return isbn;
    }
public void setTitle(String title) {
        this.title = title;
    }
public void setAuthor(String author) {
        this.author = author;
    }
public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}
class Library {
private ArrayList<Book> books;
public Library() {
        books = new ArrayList<>();
    }
public void addBook(Book book) {
        books.add(book);
    }
public boolean removeBook(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
public boolean updateBook(String isbn, String newTitle, String newAuthor, String newIsbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                book.setIsbn(newIsbn);
                return true;
            }
        }
        return false;
    }
public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        while (true) {
            System.out.println("Library Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Update Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    Book book = new Book(title, author, isbn);
                    library.addBook(book);
                    System.out.println("Book added.");
                    break;

                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String removeIsbn = sc.nextLine();
                    boolean removed = library.removeBook(removeIsbn);
                    if (removed) {
                        System.out.println("Book removed.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter ISBN of the book to update: ");
                    String updateIsbn = sc.nextLine();
                    System.out.print("Enter new title: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Enter new author: ");
                    String newAuthor = sc.nextLine();
                    System.out.print("Enter new ISBN: ");
                    String newIsbn = sc.nextLine();
                    boolean updated = library.updateBook(updateIsbn, newTitle, newAuthor, newIsbn);
                    if (updated) {
                        System.out.println("Book updated.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
