package loops;

public class TableDemoForCondition {
    //SYNTAX :( Number +"X"+i+"=" +number*i);
    public static void main(String[] args) {
        int number;
        number=2;
        for(int i=1; i<=10; i++){
            System.out.println(number+"X"+i+"=" +number*i);

        }
        for(int i=1; i<=10; i++){
            System.out.println(number*i);

        }
        number=3;
        for(int i=1; i<=10; i++){
            System.out.println(number+"X"+i+"=" +number*i);
        }
        number=4;
        for(int i=1; i<=10; i++){
            System.out.println(number+"X"+i+"=" +number*i);

        }
        number=12;
        for(int i=1; i<=10; i++){
            System.out.println(number+"X"+i+"=" +number*i);
        }
    }
}
