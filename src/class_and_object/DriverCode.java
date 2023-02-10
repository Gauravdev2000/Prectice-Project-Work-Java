package class_and_object;

public class DriverCode {
    public static void main(String[] args) {
        //Syntax : ClassName objname = new ClassName....
        College obj1= new College();
        System.out.println("This is College Name : " +obj1.collegeName);
        Student obj2= new Student("Gaurav",22,"pass");
        System.out.println("Name is : "+obj2.name +"Roll No : "+obj2.rollNo +"Result : "+obj2.result);
    }
}
