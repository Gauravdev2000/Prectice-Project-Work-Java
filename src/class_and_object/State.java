package class_and_object;

public class State {
    String stateName = "Uttar Pradesh";
    long population = 199812341;
    int district = 75;
    String language = "Hindi and English";

    public static void main(String[] args) {
        State obj1 = new State();
        System.out.println("Printing Object State Name : " + obj1.stateName);
        System.out.println("Printing Object Population : " + obj1.population);
        System.out.println("Printing Object District : " + obj1.district);
        System.out.println("Printing Object Language : " + obj1.language);
    }
}
