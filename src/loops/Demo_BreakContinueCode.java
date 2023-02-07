package loops;

public class Demo_BreakContinueCode {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            System.out.println("This is break condition "+i);
           if(i==5){
             break;
           }
        }
        for(int i=0; i<=10; i++){
            if(i==4){
                continue;

            }
            System.out.println("This is continue code"+i);
        }

    }
}
