package inheritance.oops.polymorphism;

public class DemoPolymorphism_OverLode {
    //SYNTAX : We have overLode method....
    public void method1(){
        System.out.println("This is simple method 1");
    }
    public void method1(int age){
        System.out.println("This is simple method 1 : " +age);
    }
    public void method1(String name){
        System.out.println("This is simple method 1 : " +name);
    }
    public void method1(int age, String name){
        System.out.println("This is simple method 1 : " +age +  name);
    }


    public static void main(String[] args) {
        DemoPolymorphism_OverLode obj = new DemoPolymorphism_OverLode();
        obj.method1();
        obj.method1(22);
        obj.method1("Gaurav");
        obj.method1(22,"Gaurav");
    }
}
