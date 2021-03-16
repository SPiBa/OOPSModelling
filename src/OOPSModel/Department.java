package OOPSModel;

public class Department {
    private String deptName;
    private Library library;
    private Lab lab;
    private MusicRoom musicRoom;
    private static int noOfDepartments= 0;


    //Parametrized Constructor
    public Department (String deptName, Library library , Lab lab, MusicRoom musicRoom){
        this.deptName = deptName;
        this.library = library;
        this.lab = lab;
        this.musicRoom = musicRoom;

        noOfDepartments = noOfDepartments+1;
    }

    public static int getNoOfDepartments(){
        return noOfDepartments;
    }
}
