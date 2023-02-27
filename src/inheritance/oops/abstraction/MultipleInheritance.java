package inheritance.oops.abstraction;

public class MultipleInheritance extends DemoParent1 implements DemoParent2{
    @Override
    public void infoMethod() {
        System.out.println("This is Interface Method");
    }
}
