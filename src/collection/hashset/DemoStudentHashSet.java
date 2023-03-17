package collection.hashset;

import model.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoStudentHashSet {
    public HashSet <Student> createStudentList(){

        //equal and hashcode methode....

        HashSet <Student> studentHashSet = new HashSet<>();
        Student student1 = new Student("Gaurav", 22, "pass");
        System.out.println("Printing Hashcode of student 1 : "+student1.hashCode());
        Student student2= new Student("Aman", 23, "Pass");

        System.out.println("Printing Hashcode of student 2 : "+student2.hashCode());
        Student student3 = new Student("Gaurav", 22, "pass");

        System.out.println("Printing Hashcode of student 3 : "+student3.hashCode());
        Student student4= new Student("Aman", 23, "Pass");

        System.out.println("Printing Hashcode of student 4 : "+student4.hashCode());


        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);


        return studentHashSet;

    }

    public void createLinkedHashSet(){
        LinkedHashSet <String> linkedHashSet = new  LinkedHashSet<> ();
        linkedHashSet.add("Agra");
        linkedHashSet.add("Pune");
        linkedHashSet.add("Jaipur");
        linkedHashSet.add("Mumbai");

        for(String var : linkedHashSet){
            System.out.println("Printing Linked Hashset : "+var);
        }

    }

    public static void main(String[] args) {
        DemoStudentHashSet obj =  new DemoStudentHashSet();
        HashSet <Student> studentList = obj.createStudentList();

        for(Student var : studentList){
            System.out.println("Student Data Is : " + var.getName() + "Roll No : " +var.getRollNo() + "Result : "+var.getResult());
        }

        obj.createLinkedHashSet();
    }
}
