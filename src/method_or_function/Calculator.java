package method_or_function;

public class Calculator {
    //SYNTAX : Add, Subtract, Multiply, Divide...
    public void methodAddition(){
        int a=45;
        int b=12;
        int add= a+b;
        System.out.println("Addition is :  "+add);
    }
    public void methodSubtract(){
        int a=67;
        int b=56;
        int subtract= a-b;
        System.out.println("Subtract is : "+subtract);

    }
    public void methodMultiply(){
        int a=34;
        int b=23;
        int multiply= a*b;
        System.out.println("Multiply is : "+multiply);
    }
    public void methodDivide(){
        int a=87;
        int b= 7;
        double divide = (double) a/b;
        System.out.println("Divide is : "+divide);

    }

    public static void main(String[] args) {
        //SYNTAX 1 : ClassName objName = new ClassName();
        Calculator obj= new Calculator();
        //SYNTAX : objName.methodName();
        obj.methodAddition();
        obj.methodSubtract();
        obj.methodMultiply();
        obj.methodDivide();
    }


}
