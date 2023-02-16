package method_or_function;

public class Method_ReturnType {
    //SYNTAX : access_specifier return_type method_name (Data VariableName1, Data variableName2) {code..}
    public String welcome(String name){
        String message= "Welcome to java Programming : "+name;
        return message;
    }
    public int square(int number){
        int square= number*number;
        return square;

    }
    public int checkBalance(int number){
        int balance= 5000;
        return balance;

    }

    public static void main(String[] args) {
        Method_ReturnType obj= new Method_ReturnType();
        String output= obj.welcome("Gaurav");
        System.out.println(output);
        int result= obj.square(44);
        System.out.println("Square is : "+result);
        int balance= obj.checkBalance(5000);
        if(balance>4000){
            System.out.println("My balance mini is : "+balance);

        }
        else{
            System.out.println("My balance max is : "+balance);
        }
    }
}
