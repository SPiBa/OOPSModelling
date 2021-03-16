package OOPSModel;

import java.util.ArrayList;

public class CollegeMain {

    public static void main(String[] args) {
        ArrayList<Book> enggBookList = new ArrayList<>();
        enggBookList.add(new Book("ESD2367", "Dennis Ritchie", false));
        enggBookList.add(new Book( "ENG5678", "B L THEREJA", false));
        enggBookList.add(new Book("EHG8680", "Herbert Schildt", false));

        ArrayList<Book> artsBookList = new ArrayList<>();
        artsBookList.add(new Book( "ADS670", "David Lynch", false));
        artsBookList.add(new Book("ASD678", "Julie Griffin", false));

        ArrayList<Furniture> enggLibraryFurniture = new ArrayList<>();
        enggLibraryFurniture.add(new Furniture(Type.Chair,Material.Wood));
        enggLibraryFurniture.add(new Furniture(Type.Table,Material.Wood));

        ArrayList<Furniture> artsLibraryFurniture = new ArrayList<>();
        enggLibraryFurniture.add(new Furniture(Type.Chair,Material.Wood));
        enggLibraryFurniture.add(new Furniture(Type.Table,Material.Wood));

        ArrayList<Staff> enggLibraryStaffList = new ArrayList<>();
        enggLibraryStaffList.add(new Staff("Head", "Librarian", 48));

        ArrayList<Staff> artsLibraryStaffList = new ArrayList<>();
        enggLibraryStaffList.add(new Staff("Asst", "Librarian", 26));

        ArrayList<Furniture> enggLabFurnitureList = new ArrayList<>();
        enggLabFurnitureList.add(new Furniture(Type.Chair,Material.Wood));
        enggLabFurnitureList.add(new Furniture(Type.Rack,Material.Iron));
        enggLabFurnitureList.add(new Furniture(Type.Table,Material.Wood));

        ArrayList<Furniture> artsMusicFurnitureList = new ArrayList<>();
        artsMusicFurnitureList.add(new Furniture(Type.Chair,Material.Wood));

        ArrayList<Staff> enggLabStaffList = new ArrayList<>();
        enggLabStaffList.add(new Staff("Lab", "Technician", 35));

        ArrayList<Staff> artsMusicStaffList = new ArrayList<>();
        artsMusicStaffList.add(new Staff("Music", "Teacher", 42));

        Library enggLibrary = new Library(enggBookList,enggLibraryFurniture,enggLibraryStaffList);
        Lab enggLab = new Lab(enggLabFurnitureList, enggLabStaffList);


        Library artsLibrary = new Library(artsBookList,artsLibraryFurniture,artsLibraryStaffList);
        MusicRoom artsMusicRoom = new MusicRoom(artsMusicFurnitureList,artsMusicStaffList);

        Department engineeringDept = new Department("Engineering",enggLibrary,enggLab,null);
        Department artsDept = new Department("Arts", artsLibrary,null,artsMusicRoom);

        for (Book book:enggBookList){
            if (book.getAuthor()== "B L THEREJA")
                book.setRented(true) ;
        }

        for (Book book:artsBookList){
            if (book.getIsbn()== "ASD678")
                book.setRented(true) ;
        }

//*************************************************************************************************************************
        //Fetch the number of departments the college has
        System.out.println("The no of departments in the college are " + Department.getNoOfDepartments());

        //print the details of eldest staff member
        Staff.printEldestStaff();

        //Print the total number of staff
        Staff.printTotalStaffCount();

        //Get total number of books in college
        Book.printTotalBookCount();

        //Total number of rented books
        System.out.println("Total number of books rented in college are "+ (Book.getNoOfRentedBooks(artsBookList) + Book.getNoOfRentedBooks(enggBookList)));


        //Print total number of chairs in college
        Furniture.displayTotalNoOfChairs();


    }
}


