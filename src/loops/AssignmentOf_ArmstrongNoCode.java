package loops;

public class AssignmentOf_ArmstrongNoCode {
    public static void main(String[] args) {
        int number=153, originalNumber, remainder,result=0;
        originalNumber=number;
        while(originalNumber!=0){
            remainder= originalNumber%10;
            result+= remainder*remainder*remainder;
            originalNumber/=10;


        }
        if(result==number){
            System.out.println("This is Armstrong Number...." +number);

        }
        else{
            System.out.println("This is Not Armstrong Number...." +number);
        }

    }
}
