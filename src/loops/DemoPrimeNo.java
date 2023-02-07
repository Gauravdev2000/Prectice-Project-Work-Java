package loops;

public class DemoPrimeNo {
    public static void main(String[] args) {
        int number = 7;
        int i = 2;
        while(i<=number){
            if(number%i==0){
                System.out.println("Number Is Prime No." +number);
            }
            i++;
        }



    }


}


