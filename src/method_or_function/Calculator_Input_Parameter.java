package method_or_function;

public class  Calculator_Input_Parameter {
    //SYNTAX : access_specifier return_type method_name (Data VariableName1, Data variableName2) {code..}
    public void add(int a, int b){
        int addition= a+b;
        System.out.println("Addition is :  "+addition);

    }
    public void subtract(int a, int b){
        int subtract= a-b;
        System.out.println("Subtract is : "+subtract);
    }
    public void multiply(int a, int b){
        int multiply= a*b;
        System.out.println("Multiply is : "+multiply);
    }
    public void divide(int a, int b){
        double divide=(double) a/b;
        System.out.println("Divide is : "+divide);
    }


    public static void main(String[] args) {
        Calculator_Input_Parameter obj= new  Calculator_Input_Parameter();
        obj.add(34, 54);
        obj.subtract(86, 45);
        obj.multiply(67, 56);
        obj.divide(675, 32);
    }
}
