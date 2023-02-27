package inheritance.oops.abstraction;

public class FourWheeler extends Vehicle{
    @Override
    public void servicing() {
        System.out.println("This is Four Wheeler Method");
    }

    public static void main(String[] args) {
        FourWheeler obj= new FourWheeler();
        obj.servicing();
    }
}
