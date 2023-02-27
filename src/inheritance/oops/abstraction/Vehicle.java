package inheritance.oops.abstraction;

public abstract class Vehicle {
    int engineNumber;
    double price;
    //Common feature display vehicle information..
    public void displayInfo(){
        System.out.println("This Is common Feature ");
    }
    public abstract void servicing();
}

