package model;

import java.util.Objects;

public class Student {
    String name;
    int rollNo;
    String result;
    //override hashcode and equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && name.equals(student.name) && result.equals(student.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, result);
    }

    public Student(String name, int rollNo, String result) {
        this.name = name;
        this.rollNo = rollNo;
        this.result = result;
    }
    //getter setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
