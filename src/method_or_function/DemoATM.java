package method_or_function;

import java.util.Scanner;

public class DemoATM {
    public void checkPin(int PIN){
        if(PIN== 242424){
            System.out.println("Welcome to Bank ATM : ");

        }
        else{
            System.out.println("Incorrect PIN please try again");

        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter your PIN : ");
        Scanner scannerObj= new Scanner(System.in);

        int pin= scannerObj.nextInt();

        DemoATM obj= new DemoATM();
        obj.checkPin(pin);
    }
}
