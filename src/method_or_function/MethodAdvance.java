package method_or_function;

public class MethodAdvance {
    //SYNTAX : Even and Odd Number...
    public void evenMethod(){
        for(int i=1; i<=50; i++){
            if(i%2==0){
                System.out.println("Even Number is : "+i);
            }
        }

    }
    public void oddMethod(){
        for(int i=1; i<=100; i++){
            if(i%2!=0){
                System.out.println("Odd Number is :"+i);

            }
        }

    }

    public static void main(String[] args) {
        //SYNTAX 1 : ClassName objName = new ClassName();
        MethodAdvance obj= new MethodAdvance();
        //SYNTAX : objName.methodName();
        obj.evenMethod();
        obj.oddMethod();

    }


}
