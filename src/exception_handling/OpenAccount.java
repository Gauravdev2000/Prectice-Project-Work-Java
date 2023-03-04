package exception_handling;

public class OpenAccount {
    public void openingAccount(double amount) throws LessAmountException{
        if(amount<5000){
            throw new LessAmountException("Deposit amount should be greater then 5000..");
        }
        else{
            System.out.println("Account open Successfully");
        }

    }

    public static void main(String[] args) {
        OpenAccount obj = new OpenAccount();
        try{
            obj.openingAccount(5000);
        }
        catch(Exception e){
            System.out.println("Exception Occurred : "+e);
        }


    }
}
