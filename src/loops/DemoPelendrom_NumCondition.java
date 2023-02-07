package loops;

public class DemoPelendrom_NumCondition {
    //TODO a humble that is equal to the reverse of thate same number is called a palindrome number.
    public static void main(String[] args) {
        int number=121, reverseNumber=0, remainder;
        //TODO store the number to originalNumber, We will use originalNumber to extract every digit from it.
        int originalNumber= number;
        //TODO here we are going to write logic to reverse of originalNumber..
        while(number!=0)//TODO we are going to run this logic until it reaches to 0..

        {

            remainder=number%10;//TODO here we are trying to get last digit of number..
            reverseNumber= reverseNumber*10+remainder;//TODO here we are trying to shift the digit to prevision digit sum....
            number/=10;//TODO here we are trying to pick another digit by moving to next digit after divide....

        }
        //TODO here we are checking if reverseNumber and originalNumber are equal it means it is palindrome
        if(originalNumber==reverseNumber){
            System.out.println("This is Palindrome number...." +originalNumber);

        }
        else{
            System.out.println("This is Not Palindrome number....."+originalNumber);
        }
    }
}
