package method_or_function;

public class SquareAndCube {
    //SYNTAX : Square and Cube...
    public void makingSquare() {
        int number;
        number = 5;
        int square = number * number;
        System.out.println("Square is 5 : " + square);
    }

    public void makingCube() {
        int number;
        number = 6;
        int cube = number * number * number;
        System.out.println("Cube is 6 : " + cube);
    }

    public static void main(String[] args) {
        //SYNTAX : ClassName objName = new ClassName();
        SquareAndCube obj = new SquareAndCube();
        //objName.methodName();
        obj.makingSquare();
        obj.makingCube();
    }
}