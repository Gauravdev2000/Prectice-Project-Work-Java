package inheritance.oops.abstraction;

public class Demo_Child extends DemoAbstraction{


    @Override
    public void m2() {
        System.out.println("This is m2 method");
    }

    @Override
    public void m3() {
        System.out.println("This is m3 method");
    }

    public static void main(String[] args) {
        Demo_Child obj= new Demo_Child();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
