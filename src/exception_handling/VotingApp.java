package exception_handling;

public class VotingApp {
    public void voting(int age) throws AgeNotEligibleException{
        if(age>=18){
            System.out.println("Welcome to the voting application");
        }
        else{
            throw new AgeNotEligibleException("Age should be less then 18 then not eligible for voting");
        }
    }

    public static void main(String[] args) {
        VotingApp obj = new VotingApp();
        try{
            obj.voting(17);
        }
        catch(Exception e){
            System.out.println("Exception occurred : "+e);
        }

    }
}
