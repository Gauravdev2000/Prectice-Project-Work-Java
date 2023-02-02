package conditional_statement;

public class Assignment31janAndjava {
    public static void main(String[] args) {
        int price;
        String brand;
        price=999; brand="IBM";
        if(price<1000 & brand=="IBM"){
            System.out.println("This is Low price product");

        }
        price=2500;
        if(price>1000 & price<5000){
            System.out.println("This Medium price product");

        }
        price=5100;
        if(price>5000){
            System.out.println("This is High price product");
        }
    }
}
