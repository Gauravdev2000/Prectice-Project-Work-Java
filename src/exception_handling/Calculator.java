package exception_handling;

public class Calculator {
    // SYNTAX : Exception are runtime evens which can stop execution of you code.
  public int divide(int a, int b){
      int result= 0;
      try{
           result =a/b;

      }
      catch(Exception e){
          System.out.println("Exception Occurred : "+e);
      }
      finally{
          System.out.println("This is Finally block and it will always excuted");
      }

      return result;
  }

    public static void main(String[] args) {
        Calculator obj= new Calculator();

        int output= obj.divide(8, 2);
        System.out.println("Divide is : "+ output);

       output=  obj.divide(3, 0);
        System.out.println("Divide by zero : "+output);






    }
}
