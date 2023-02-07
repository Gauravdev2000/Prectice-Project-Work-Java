package loops;

public class AssignmentPalindrome_Num {
    public static void main(String[] args) {
        int number=1221, reverseNum=0, remainder;
        int originalNum=number;
        while(number!=0){
            remainder=number%10;
            reverseNum=reverseNum*10+remainder;
            number/=10;
        }
        if(originalNum==reverseNum){
            System.out.println("This is Palindrome num..."+originalNum);

        }
        else{
            System.out.println("This is Not Palindrome no..."+originalNum);
        }

    }
}
