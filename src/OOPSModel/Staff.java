package OOPSModel;

import java.util.*;

public class Staff {
    private  int age;
    private  String fname;
    private  String lname;
    private static int staffCount = 0;
    private static  int eldestAge = 0;
    private static String eldestfname;
    private static String eldestlname;

    //Parametrized constructor
    public Staff(String fname, String lname, int age){

        this.fname = fname;
        this.lname = lname;
        this.age = age;
        staffCount = staffCount +1;

        if (this.age > eldestAge) {
            eldestAge = this.age;
            eldestfname = this.fname;
            eldestlname = this.lname;
        }

    }

    public static void printTotalStaffCount(){
        System.out.println("The total number of staff in the college are " + staffCount);
    }

    public static void printEldestStaff(){
        System.out.println("The eldest staff in the college is " + eldestfname + " " + eldestlname + " of age " + eldestAge + " years." );
    }

}
