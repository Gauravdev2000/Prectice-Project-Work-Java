package collection.list;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {
    public void createStudentArrayList(){
        ArrayList <Student> studentArrayList = new ArrayList<>();
        Student student1 = new Student("Gaurav", 22, "pass");
        Student student2= new Student("Aman", 23, "Pass");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        for(Student var : studentArrayList){
            System.out.println("Student Name : "+var.getName() + "RollNo : "+var.getRollNo() + "Result : "+var.getResult());
        }

    }

    public static void main(String[] args) {
        StudentArrayList obj = new StudentArrayList();
        obj.createStudentArrayList();
    }
}
