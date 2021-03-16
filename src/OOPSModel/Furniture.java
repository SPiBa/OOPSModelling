package OOPSModel;
enum Type {Chair,Table,Rack}
enum Material {Wood,Iron}

public class Furniture {

    private Type type;
    private Material material;
    private static int noOfChairs = 0;

    public Furniture(Type type, Material material){
        this.type = type;
        this.material = material;

        if (type.name().equals("Chair"))
            noOfChairs = noOfChairs + 1;
    }


    public static void displayTotalNoOfChairs(){
        System.out.println("The total number of chairs in the college are " + noOfChairs);
    }
}
