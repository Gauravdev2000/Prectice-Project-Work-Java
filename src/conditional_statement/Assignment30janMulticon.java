package conditional_statement;

public class Assignment30janMulticon {
    public static void main(String[] args) {
        int age;
        String city;
        age=21; city="Agra";
        if(age>18 & city=="Delhi" || city=="Mumbai" || city=="Chennai" || city=="Bangalore"){
            System.out.println("Person is eligible for voting in Metro City");

        }
        else{
            System.out.println("Person is not eligible for voting in Metro city" +city);

        }
        //Marks condition//
        int mark;
        mark=40;
        if(mark>=33 & mark<44){
            System.out.println("Student is Clear exam with Third division");


        }
        mark=55;
        if(mark>44 & mark<60){
            System.out.println("Student is clear exam with Second division");

        }
        mark=65;
        if(mark>60){
            System.out.println("Student is clear with First division");

        }
        int mark1=200;
        if(mark1>=33 & mark1<44){
            System.out.println("Student is Clear exam with Third division");

        }
        if(mark1>=44 & mark1<60){
            System.out.println("Student is Clear exam with Second division");

        }
        if(mark1>60){
            System.out.println("Student is Clear exam with First division");

        }
        if(mark1<33){
            System.out.println("Student fail in the exam");
        }



    }
}
