package loops;

public class Assignment03FebForLoop {
    public static void main(String[] args) {
        //SYNTAX : Table of 5.
        int number;
        number=5;
        for(int i=1; i<=10; i++){
            System.out.println(number+"X"+i+"=" +number*i);

        }
        int fact=1;
        for(int i=1;i<=7;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of  is  "+fact);
    }
    }

