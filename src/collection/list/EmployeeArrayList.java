package collection.list;

import model.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {
    public  ArrayList<Employee>  createEmployeeArrayList(){

        ArrayList<Employee> EmployeeArrayList= new  ArrayList<Employee>();
        Employee employee= new Employee("Gaurav", "Agra", 25000);

        EmployeeArrayList.add(employee);
        return EmployeeArrayList;

    }

    public static void main(String[] args) {
        EmployeeArrayList obj = new EmployeeArrayList();
        ArrayList<Employee>  employee= obj.createEmployeeArrayList();

        for(Employee var : employee){
            System.out.println("Employee Data : "+var.getName() + "Location : " + var.getLocation() + "Salary : " + var.getSalary());
        }
    }
}
