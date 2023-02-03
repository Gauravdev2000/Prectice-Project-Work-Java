package conditional_statement;

public class DemoSwitchState {
    public static void main(String[] args) {
        //Write a program day of week based on day number//
        //1.Sunday
        //2.Monday
        //3.Tuesday
        //4.Wednesday
        //5.Thursday
        //6.Friday
        //7.Saturday
        int day;
        day= 5;
        switch(day){
            case 1:
                System.out.println("Sunday");
            break;
            case 2:
                System.out.println("Monday");
            break;
            case 3:
                System.out.println("Tuesday");
            break;
            case 4:
                System.out.println("Wednesday");
            break;
            case 5:
                System.out.println("Thurday");
            break;
            case 6:
                System.out.println("Friday");
            break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid program");


        }
        String state= "DL";
        switch(state){
            case "MH":
                System.out.println("Maharashtra");
            break;
            case "UP":
                System.out.println("Uttar Pradesh");
            break;
            case "PB":
                System.out.println("Punjab");
            break;
            case "DL":
                System.out.println("Delhi");
            break;
            default:
                System.out.println("Invalid Program");

        }

    }
}
