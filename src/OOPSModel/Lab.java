package OOPSModel;

import java.util.ArrayList;

public class Lab extends Facility {
    private static int noOfChairs = 0;
    private static int staffCount = 0;

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

    public int getChairCount(){
        return noOfChairs;
    }

    public int getStaffCount(){
        return staffCount;
    }
}
