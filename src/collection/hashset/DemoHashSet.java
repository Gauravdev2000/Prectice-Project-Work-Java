package collection.hashset;

import java.util.HashSet;

public class DemoHashSet {
     public  HashSet <String> createHashSet(){
         HashSet <String> set = new HashSet <>();
         set.add("Java");
         set.add("Java Coading ");
         set.add("Spring Boot");
         set.add("Java");
         set.add("Java Coading ");
         set.add("Spring Boot");

         System.out.println("Size of set is : "+set.size());
         return set;

     }
     public  HashSet <Double> createDoubleSet(){
         HashSet <Double> doubleHashSet = new HashSet<>();

         doubleHashSet.add(345.45);
         doubleHashSet.add(5726.63);
         doubleHashSet.add(5383.33);
         doubleHashSet.add(345.45);
         doubleHashSet.add(5726.63);
         doubleHashSet.add(5383.33);

         System.out.println("Size of Double  Set is : " +doubleHashSet.size());
         return doubleHashSet;
     }

    public static void main(String[] args) {
        DemoHashSet obj = new DemoHashSet();
        HashSet <String> hashSet= obj.createHashSet();
        for(String var : hashSet){
            System.out.println("print all element : "+var);
        }
        HashSet <Double> doubleSet = obj.createDoubleSet();
        for(Double var : doubleSet){
            System.out.println("Print all Element : "+var);
        }


    }
}
