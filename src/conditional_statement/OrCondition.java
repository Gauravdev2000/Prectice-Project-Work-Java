package conditional_statement;

public class OrCondition {
    public static void main(String[] args) {
        int age;
        String city;
        age = 19;
        city = "Agra";
        //True|| True= True//
        if (age > 18 || city == "Agra") {
            System.out.println("This is eligible for voting in Agra");

        } else {
            System.out.println("This is not eligible for voting in Agra");


        }
        //True || False= True//
        city = "Delhi";
        if(age>18 || city=="Agra"){
            System.out.println("This is eligible for voting in Agra");

        }
        else{
            System.out.println("This is not eligible for voting in Agra");
        }
        //False || True= True//
        age=20;
        if(age>18 || city=="Agra"){
            System.out.println("This is eligible for voting in Agra");

        }
        else{
            System.out.println("This is not eligible for voting in Agra");

        }
        //False || False= False//
        age=21; city= "Pune";
        if(age>18 || city=="Pune"){
            System.out.println("This is eligible for voting in Agra ");

        }
        else{
            System.out.println("This is not eligible for voting in Agra");
        }


    }
}