package class_and_object;

public class Student {

    String name;
    int rollNo;
    String result;
    //Parameterized Constructor....//Syntax..


    public Student(String name, int rollNo, String result) {
        this.name = name;
        this.rollNo = rollNo;
        this.result = result;
    }

    public static void main(String[] args) {
        Student obj1= new Student("Gaurav",22,"Pass");
        System.out.println("Object Name is : " + obj1.name +  "Object Roll No. is : " + obj1.rollNo +  "Object Result : " + obj1.result);
        Student obj2= new Student("Aman", 23,"Pass");
        System.out.println("Name is : "+obj2.name +"Roll No is : "+obj2.rollNo +"Result : "+obj2.result);

    }
}
