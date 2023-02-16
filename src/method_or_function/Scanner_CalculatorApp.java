package method_or_function;

import java.util.Scanner;

public class Scanner_CalculatorApp {
    public int add(int a, int b){
        int addition= a+b;
        return addition;
    }
    public int subtract(int a, int b){
        int sub=a-b;
        return sub;
    }
    public int multiply(int a, int b){
        int multi= a*b;
        return multi;
    }
    public double divide(int a, int b){
        double div=(float) a/b;
        return div;
    }


    public static void main(String[] args) {
        System.out.println("Please enter value of a :");
        Scanner scannerObj= new Scanner(System.in);
        int a= scannerObj.nextInt();

        System.out.println("Please enter value of b : ");
        int b= scannerObj.nextInt();
        System.out.println("Please entered your choice : 1 For Addition, 2 For Subtract, 3 For Multiply, 4 For Divide");
        int choice= scannerObj.nextInt();

        Scanner_CalculatorApp obj= new Scanner_CalculatorApp();
        if(choice==1){
            int add= obj.add(a,b);
            System.out.println("Sum Of : "+add);
        }
        else if(choice==2){
            int sub= obj.subtract(a,b);
            System.out.println("Subtract is : "+sub);
        }
        else if(choice==3){
            int multi=obj.multiply(a,b);
            System.out.println("Multiply is : "+multi);
        }
        else if(choice==4){
            double div= obj.divide(a,b);
            System.out.println("Divide is : "+div);
        }


    }
}
