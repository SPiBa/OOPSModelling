package OOPSModel;

import javax.print.attribute.AttributeSet;
import java.util.ArrayList;

public class CollegeMain {

    public static void main(String[] args) {


        Library enggLib = new Library();
        enggLib.Book("ESD2367", "Dennis Ritchie", false);
        enggLib.Book("ENG5678", "B L THEREJA", false);
        enggLib.Book("EHG8680", "Herbert Schildt", false);

        enggLib.Furniture(Facility.Type.Chair, Facility.Material.Wood);
        enggLib.Furniture(Facility.Type.Table, Facility.Material.Wood);
        enggLib.Furniture(Facility.Type.Rack, Facility.Material.Iron);

        enggLib.Staff("Head", "Librarian", 48);

        Lab enggLab = new Lab();
        enggLab.Furniture(Facility.Type.Rack, Facility.Material.Iron);
        enggLab.Furniture(Facility.Type.Table, Facility.Material.Iron);

        enggLab.Staff("Lab", "Technician", 35);

        Library artsLib = new Library();
        artsLib.Book("ADS670", "David Lynch", false);
        artsLib.Book("ASD678", "Julie Griffin", false);

        artsLib.Furniture(Facility.Type.Table, Facility.Material.Wood);
        artsLib.Furniture(Facility.Type.Chair, Facility.Material.Wood);

        artsLib.Staff("Asst", "Librarian", 26);

        MusicRoom artsMusic = new MusicRoom();
        artsMusic.Furniture(Facility.Type.Chair, Facility.Material.Wood);
        artsMusic.Staff("Music", "Teacher", 62);


        //Get the number of books in college
        System.out.println("Total number of books in the college is  " +(enggLib.getBookCount() + artsLib.getBookCount()));

        //Get total of rented books

        //Total no of chairs in college
        int totalChairs = enggLib.getChairCount() +enggLab.getChairCount() + artsLib.getChairCount()+artsMusic.getChairCount();
        System.out.println("Total number of chairs in the college are" + totalChairs);

        //Total Staff in Collge
        int totalStaff = enggLib.getStaffCount() + enggLab.getStaffCount() + artsLib.getStaffCount() + artsMusic.getStaffCount();
        System.out.println("Total number of staff in the college are" + totalStaff);

        //Get oldest staff
        enggLib.displayEldestStaffDetails();

    }
}


