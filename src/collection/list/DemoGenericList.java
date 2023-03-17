package collection.list;

import java.util.ArrayList;

public class DemoGenericList {

    public  ArrayList <String> createStringList(){
        ArrayList <String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Hello Java");
        stringArrayList.add("I am Gaurav Dev");
        stringArrayList.add("Learn Java Code");

        return stringArrayList;
    }
    public ArrayList <Integer>  createIntegerList(){
        ArrayList <Integer> integersArrayList = new ArrayList<>();

        integersArrayList.add(20);
        integersArrayList.add(21);
        integersArrayList.add(22);
        integersArrayList.add(23);

        return integersArrayList;

    }

    public static void main(String[] args) {
        DemoGenericList obj = new DemoGenericList();
        ArrayList <String> list=  obj.createStringList();
        for(String var : list){
            System.out.println("Print All Element : "+var);
        }
        ArrayList <Integer> integersArrayList= obj.createIntegerList();
        for(int i = 0; i<integersArrayList.size(); i++){
            System.out.println("Print All Number : "+integersArrayList);
        }
    }
}
