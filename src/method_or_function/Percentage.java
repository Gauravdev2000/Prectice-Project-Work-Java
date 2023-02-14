package method_or_function;

public class Percentage {


    public void percentage(int number ){
        int percentage=5;
        double result=(double) (number*percentage)/100;
        System.out.println("Percentage is : "+result);
    }

    public static void main(String[] args) {
        Percentage obj= new Percentage();
        obj.percentage(68);
    }
}
