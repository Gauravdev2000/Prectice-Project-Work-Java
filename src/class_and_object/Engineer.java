package class_and_object;

public class Engineer {
    String name= "Gaurav Dev";
    int age= 22;
    String branch= "Electrical Engineer";
    String experience= "Fresher";
    String work= "Maintenance";
    int salary= 15500;

    public static void main(String[] args) {
        //Syntax : Class objName= new ClassName();    // Object Printing FORMULA= OBJ1.NAME.....
        Engineer obj1= new Engineer();
        System.out.println("Printing Object Name : "+obj1.name);
        System.out.println("Printing Object Age : "+obj1.age);
        System.out.println("Printing Object Branch : "+obj1.branch);
        System.out.println("Printing Object Experience : "+obj1.experience);
        System.out.println("Printing Object Work : "+obj1.work);
        System.out.println("Printing Object Salary : "+obj1.salary);
    }
}
