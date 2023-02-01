package conditional_statement;

public class NotCondition {
    public static void main(String[] args) {
        String country= "India";
        if( !(country=="India") ){
            System.out.println("Person is Indian");

        }
        else{
            System.out.println("Person is Foreigner");
        }
        int age=22;
        if( !(age>18) ){
            System.out.println("This person is eligible for voting");

        }
        else{
            System.out.println("This person is not eligible for voting ");
        }
    }
}
