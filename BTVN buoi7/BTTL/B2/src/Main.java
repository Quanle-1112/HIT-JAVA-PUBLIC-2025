import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book [] books = new Book[3];
        Scanner sc = new Scanner(System.in);
        try {
            for(int i = 0; i < books.length; i++){
                System.out.println("Enter the name of the book " + (i + 1) + ": " );
                System.out.println("Enter the book title: ");
                String bookTitle = sc.nextLine();
                System.out.println("Enter the book author: ");
                String bookAuthor = sc.nextLine();

                books[i] = new Book(bookTitle, bookAuthor);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < books.length; i++)
            System.out.println(books[i].toString());

    }
}