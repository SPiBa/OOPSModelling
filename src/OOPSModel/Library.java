package OOPSModel;

import java.util.ArrayList;


public class Library extends Facility {

    public int bookCount = 0;
    private static int noOfChairs = 0;
    private static int staffCount = 0;


    @Override
    public void Book(String isbn, String author, boolean isRented) {
        super.Book(isbn, author, isRented);
        bookCount = bookCount + 1;
    }

    @Override
    public void Furniture(Type type, Material material) {
        super.Furniture(type, material);
        if (type.name().equals("Chair"))
            noOfChairs = noOfChairs + 1;
    }

    @Override
    public void Staff(String fname, String lname, int age) {
        super.Staff(fname, lname, age);
        staffCount = staffCount +1;
    }

    public int getBookCount(){
        return bookCount;
    }

    public int getChairCount(){
        return noOfChairs;
    }

    public int getStaffCount(){
        return staffCount;
    }


}
