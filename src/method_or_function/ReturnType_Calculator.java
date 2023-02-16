package method_or_function;

public class ReturnType_Calculator {
    //SYNTAX : access_specifier return_type method_name (Data VariableName1, Data variableName2) {code..}
    //SYNTAX : Return type....
    public int add(int a, int b){
      int addition= a+b;
      return addition;
    }
    public int subtract(int a, int b){
        int sub= a-b;
        return sub;
    }
    public int multiply(int a, int b){
        int multi= a*b;
        return multi;
    }
    public double divide(int a, int b){
        double div=(double) a/b;
        return div;
    }
    public double percentage(int number, int percentage){
        double ratio=(double) (number*percentage)/100;
        return ratio;
    }


    public static void main(String[] args) {
        ReturnType_Calculator obj= new ReturnType_Calculator();
        int add= obj.add(564, 767);
        System.out.println("Addition IS : "+add);

        int sub= obj.subtract(768, 645);
        System.out.println("Subtract Is : "+sub);

        int multiply= obj.multiply(647, 746);
        System.out.println("Multiply Is : "+multiply);

        double div= obj.divide(67, 23);
        System.out.println("Divide Is : "+div);

        double result= obj.percentage(546, 25);
        System.out.println("Percentage Is : "+result);

    }
}
