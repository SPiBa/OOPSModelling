package OOPSModel;

import java.util.ArrayList;

public class Book {

    private String isbn;
    private String author;
    private boolean isRented;
    private static int bookCount = 0;
    private static int rentedBookCount = 0;



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }


    public Book(String isbn, String author, boolean isRented){
        this.isbn = isbn;
        this.author = author;
        this.isRented = isRented;
        bookCount = bookCount + 1;
    }

    //Print total number of books
    public static void printTotalBookCount () {
        System.out.println("Total number of books in the library are " + bookCount);
    }

    //Print no of books that are rented
    public static int getNoOfRentedBooks(ArrayList<Book> bookList) {
        int count = 0;
        for (Book book : bookList) {
            if (book.isRented() == true)
                count = count + 1;
        }
        return count;

    }

}
