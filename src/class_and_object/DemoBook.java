package class_and_object;

public class DemoBook {
    String name= "Java";
    int pages=400;
    String writerName="Games Gosling";
    double price= 450.2;

    public static void main(String[] args) {
        //Syntax : Class objName= new ClassName();    // Object Printing FORMULA= OBJ1.NAME....
        DemoBook obj1=new DemoBook(); //object created with name obj1......
        System.out.println("Printing Object : " +obj1.name);
        System.out.println("Printing Object : " +obj1.pages);
        System.out.println("Printing Object : " +obj1.writerName);
        System.out.println("Printing object : " +obj1.price);
        DemoBook obj2=new DemoBook();
        System.out.println("Printing Object : " +obj2.name);
        System.out.println("Printing Object : " +obj2.pages);
        System.out.println("Printing Object : " +obj2.writerName);
        System.out.println("Printing object : " +obj2.price);
        DemoBook obj3=new DemoBook();
        System.out.println("Printing Object : " +obj3.name);
        System.out.println("Printing Object : " +obj3.pages);
        System.out.println("Printing Object : " +obj3.writerName);
        System.out.println("Printing object : " +obj3.price);
    }

}
