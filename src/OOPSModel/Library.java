package OOPSModel;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> book;
    ArrayList<Furniture> furniture;
    ArrayList<Staff> staff;


    public Library(ArrayList<Book> book, ArrayList<Furniture> furniture, ArrayList<Staff> staff) {
        this.book = book;
        this.furniture = furniture;
        this.staff = staff;
    }
}
