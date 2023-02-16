package method_or_function;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        // reading string value..
        System.out.println("Please enter your name : ");
        //create object of scanner class
        Scanner scannerObj = new Scanner(System.in);
       String name=  scannerObj.nextLine();// it read String input and return
        System.out.println("You have entered name as : "+name);


        //reading int value
        System.out.println("Please enter your age : ");

       int age=  scannerObj.nextInt();//it read integer value and return
        System.out.println("You have entered age as : "+age);

        //read ing decimal value
        System.out.println("Please enter your salary : ");
       double salary=  scannerObj.nextDouble();
        System.out.println("You have entered salary as : "+salary);
    }
}
