package conditional_statement;

public class Andcondition {
    public static void main(String[] args) {
        int age;
        String city;
        age=19; city="Agra";
        //True & True= True//
        if(age>18 & city=="Agra"){
            System.out.println("This is eligible for voting in Agra");

        }
        else{
            System.out.println("This is not eligible for voting in Agra");

        }
        //True & False= False//
        city="Delhi";
        if(age>18 & city=="Agra"){
            System.out.println("This is eligible for voting in Agra");

        }
        else{
            System.out.println("This is not eligible for voting in Agra");

        }
        //False & True= False//
        age=15;
        city="Agra";
        if(age>18 & city=="Agra"){
            System.out.println("This is eligible for voting in Agra");

        }
        else{
            System.out.println("This is not eligible for voting in Agra");

        }
        //False & False= False//
        age=15;
        city= "Delhi";
        if(age>18 & city=="Agra"){
            System.out.println("This is eligible for voting in Agra");

        }
        else{
            System.out.println("This is not eligible for voting in Agra");

        }



    }


    }

