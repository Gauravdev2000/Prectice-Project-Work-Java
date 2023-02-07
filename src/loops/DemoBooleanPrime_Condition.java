package loops;

public class DemoBooleanPrime_Condition {
    public static void main(String[] args) {
        int number=13;
        boolean flag= true;
        for(int i =2; i<number; i++){
            if(number%i==0){
                flag=false;

            }
            if(flag){
                System.out.println("Number is Prime No." +number);

            }
            else{
                System.out.println("Number is not Prime No. " +number);
            }
        }


    }

}
