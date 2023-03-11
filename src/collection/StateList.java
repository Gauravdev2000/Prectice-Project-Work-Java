package collection;

import java.util.ArrayList;

public class StateList {
    public void CreateState_List(){
        ArrayList list = new ArrayList();
        list.add("Andhra Pradesh");
        list.add("Arunachal Pradesh");
        list.add("Assam");
        list.add("Bihar");
        list.add("Chattisgarh");
        list.add("Goa");
        list.add("Gujrat");
        list.add("Haryana");
        list.add("Himachal Pradesh");
        list.add("Jammu and Kashmir");
        list.add("Jharkhand");
        list.add("Karnataka");
        list.add("Kerala");
        list.add("Madhya Pradesh");
        list.add("Maharashtra");
        list.add("Manipur");
        list.add("Meghalaya");
        list.add("Mizoram");
        list.add("Nagaland");
        list.add("Odisha");
        list.add("Punjab");
        list.add("Rajasthan");
        list.add("Sikkim");
        list.add("Tamil Nadu");
        list.add("Telangana");
        list.add("Tripura");
        list.add("Uttar Pradesh");
        list.add("UttaraKhand");
        list.add("West Bengal");
        for(int i= 0; i<list.size(); i++){
            System.out.println("All State : "+list.get(i));
        }


        int j=0;
        while(j<list.size()){
            System.out.println("All State : "+list.get(j));
            j++;
        }
        int k= 0;
        do{
            System.out.println("All state : "+list.get(k));
            k++;
        }while(k<list.size());









    }

    public static void main(String[] args) {
        StateList obj = new StateList();
        obj.CreateState_List();
    }
}
