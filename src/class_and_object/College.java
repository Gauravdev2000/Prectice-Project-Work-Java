package class_and_object;

public class College {
    String collegeName= "Dayal Bagh College";
    String affiliated= "Government";
    String university= "Dayal Bagh University";
    int establishment= 1915;
    String address= "Baghwan Takies Agra";

    public static void main(String[] args) {
        College obj1= new College();
        System.out.println("Printing Object College Name : "+obj1.collegeName);
        System.out.println("Printing Object Affiliated : "+obj1.affiliated);
        System.out.println("Printing Object University : "+obj1.university);
        System.out.println("Printing Object Establishment Of : "+obj1.establishment);
        System.out.println("printing object Address : "+obj1.address);
    }
}
