package class_and_object;

public class Parameterized_Constructor {
    //Syntax : Doctor Constructor....//
    String doctorName;
    String specialist;
    int experience;

    public Parameterized_Constructor(String doctorName, String specialist, int experience) {
        this.doctorName = doctorName;
        this.specialist = specialist;
        this.experience = experience;
    }

    public static void main(String[] args) {
        Parameterized_Constructor obj1= new  Parameterized_Constructor("Dr.Piyush Goyal","Cardiologists",10);
        System.out.println("Doctor Name is : "+obj1.doctorName +"Specialist Is : " +obj1.specialist +"Experience Is : "+obj1.experience);


    }

}
