package loops;

public class DemoArmstrongNumber {
    //TODO case of an Armstrong number of 3 digit, the sum of cube of each digit is equal to yhe number  itself. For Example
    // 153= 1*1*1 + 5*5*5 + 3*3*3 // 153 is an armstrong number.*/
    public static void main(String[] args) {
        int number =371, originalNumber,remainder, result=0;
        //TODO here we have taken variable to store our result , Remainder an Original number which we will use further
        originalNumber=number;//TODO here we are going to use original number to extract every digit from it.
        while(originalNumber!=0)//TODO we ar going to run this logic until we reach to 0..
        {
            remainder= originalNumber%10;//TODO here we are trying to extract last digit from original number using modulus operator..
            result+= Math.pow(remainder,3);//TODO here we are doing cube of last digit and store tp result, Every time we will also
                                             //store previous sum to that we can compare with final sum with actual number//


            originalNumber/=10;//TODO gere we are trying to get the second digit from given number so we can extract next digit...

        }
        if(result==number)
        {
            System.out.println("This No. is Armstrong number ...." +number);

        }
        else
        {
            System.out.println("This no. is not Armstrong number...." +number);
        }
    }
}
