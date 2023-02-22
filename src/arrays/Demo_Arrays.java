package arrays;

public class Demo_Arrays {
    public static void main(String[] args) {
        //SYNTAX : Datatype VarName [] = {Value 1, Value 2, Value 3.....};
        String cities [] = {"Agra", "Delhi", "Mumbai", "Jaipur", "Pune", "Kanpur", "Lucknow"};
        System.out.println(cities[2]);


        for(int i=0; i<cities.length; i++){
            System.out.println("Printing all elements in Loop : "+cities[i]);
        }
        int i=0;
        while(i<cities.length){
            System.out.println("Printing all elements in Loop : "+cities[i]);
            i++;
        }
        for(String var: cities){
            System.out.println("Printing advance loop : "+var);

        }
        int marks [] = {35,45,34,23,22,9};
        System.out.println(marks[3]);
        for(int j=0; j<marks.length; j++){
            System.out.println("Printing al marks : "+marks[j]);
        }
    }
}

