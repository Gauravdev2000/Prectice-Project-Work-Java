package method_or_function;

public class Factorial {

    public void fact(int number){
        for(int i=1; i<=8; i++){
            number=number*i;

        }
        System.out.println("Factorial is : "+number);
    }

    public static void main(String[] args) {
        Factorial obj= new Factorial();
        obj.fact(1);
    }
}
