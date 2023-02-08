package class_and_object;

public class DemoCountry {
    String countryName = "India";
    long population = 1415199835;
    int states = 28;
    double gdp = 3.18;

    public static void main(String[] args) {
        DemoCountry obj1 = new DemoCountry();
        System.out.println("Printing Object : " + obj1.countryName);
        System.out.println("Printing Object : " + obj1.population);
        System.out.println("Printing Object : " + obj1.states);
        System.out.println("Printing Object : " + obj1.gdp);
    }

}

