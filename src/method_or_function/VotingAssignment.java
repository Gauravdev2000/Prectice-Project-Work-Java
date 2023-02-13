package method_or_function;

public class VotingAssignment {
    public void votingMethod() {
        int age;
        String city;
        age = 19;
        city = "Agra";

        if (age >= 18 & city == "Agra") {
            System.out.println("Person is eligible voting in Agra");
        }

    }

    public static void main(String[] args) {
        //SYNTAX 1 : ClassName objName = new ClassName();
        VotingAssignment obj= new VotingAssignment();
        //SYNTAX : objName.methodName();
        obj.votingMethod();
    }
}