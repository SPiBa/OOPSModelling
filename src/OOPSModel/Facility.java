package OOPSModel;

public abstract class Facility {

    enum Type {Chair,Table,Rack}
    enum Material {Wood,Iron}


    private String isbn;
    private String author;
    private boolean isRented;
    private Type type;
    private Material material;
    private  int age;
    private  String fname;
    private  String lname;
    private static  int eldestAge = 0;
    private static String eldestfname;
    private static String eldestlname;


    public void Book(String isbn, String author, boolean isRented){
        this.isbn = isbn;
        this.author = author;
        this.isRented = isRented;
    }

    public void Furniture (Type type, Material material){
        this.type = type;
        this.material = material;
    }

    public void Staff(String fname, String lname, int age){

        this.fname = fname;
        this.lname = lname;
        this.age = age;

        if(this.age > eldestAge){
            eldestAge = this.age;
            eldestfname = this.fname;
            eldestlname = this.lname;
        }

    }

    public void displayEldestStaffDetails (){
        System.out.println("The eldest staff in the college is " + eldestfname + ", " +eldestlname+ " of age " + eldestAge);
    }

}
