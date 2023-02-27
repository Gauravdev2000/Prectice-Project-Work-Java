package inheritance.oops.abstraction;

public class TwoWheeler extends Vehicle {

    @Override
    public void servicing() {
        System.out.println("This is Two wheeler service");
    }

    public static void main(String[] args) {
        TwoWheeler obj= new TwoWheeler();
        obj.servicing();
    }
}
