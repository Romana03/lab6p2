import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Display books");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consumăm newline

            switch (choice) {
                case 1:
                    // Adăugare carte
                    System.out.println("Enter information for the book:");
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String ISBN = scanner.nextLine();
                    Book newBook = new Book(title, author, ISBN);
                    library.addBook(newBook);
                    break;
                case 2:
                    // Ștergere carte
                    System.out.println("Enter the ISBN of the book to remove:");
                    String ISBNToRemove = scanner.nextLine();
                    Book bookToRemove = new Book("", "", ISBNToRemove);
                    library.removeBook(bookToRemove);
                    break;
                case 3:
                    // Afișare cărți
                    library.displayBooks();
                    break;
                case 4:
                    // Ieșire din program
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}