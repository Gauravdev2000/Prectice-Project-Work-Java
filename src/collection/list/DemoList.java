package collection.list;

import java.util.ArrayList;

public class DemoList {
    // create ArrayList Collection
    public void CreateList(){
        //SYNTAX : CollectionName objName + CollectionName();
        ArrayList list = new ArrayList();// Object create array list
        //objectName();
        list.add("Hello Java");
        list.add("I Am Gaurav Dev");
        list.add(22);
        list.add(25000.567);

        System.out.println(list.get(1));
        //loop
        for(int i=0; i<list.size(); i++){
            System.out.println("Printing Array List In Loop :  "+list.get(i) );
        }
        for(Object var : list){
            System.out.println("Printing using Advance Loop : "+var);
        }
        list.remove(2);
        for(Object var : list){
            System.out.println("Printing using for remove Advance Loop : " +var);
        }
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)== "I Am Gaurav Dev"){
                System.out.println("Element Found At Index : "+i);
            }
            else{
                System.out.println("Element not Found At Index : "+i);
            }

        }



    }

    public static void main(String[] args) {
        DemoList obj= new DemoList();
        obj.CreateList();
    }
}
