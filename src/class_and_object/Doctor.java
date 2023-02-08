package class_and_object;

public class Doctor {
    String doctorName="Dr.Piyush Goyal";
    String specialist= "Cardiologists";
    String doctorCity= "Agra";
    int experience= 10 ;
    int doctorFee= 2000;
    String hospitalName= "Synergy Hospital";
    //Syntax : Class objName= new ClassName();    // Object Printing FORMULA= OBJ1.NAME..
    public static void main(String[] args) {
        Doctor obj1= new Doctor();
        System.out.println("Printing object Name : " +obj1.doctorName);
        System.out.println("Printing Object Specialist : " +obj1.specialist);
        System.out.println("Printing object City : " +obj1.doctorCity);
        System.out.println("Printing object Experience : " +obj1.experience +"Year");
        System.out.println("Printing object Fee : " +obj1.doctorFee);
        System.out.println("Printing object Hospital : " +obj1.hospitalName);

    }



}
