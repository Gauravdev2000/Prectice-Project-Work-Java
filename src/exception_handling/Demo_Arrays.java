package exception_handling;

import com.sun.xml.internal.txw2.DatatypeWriter;

public class Demo_Arrays {
    public void arrays(){
        int number []= {23,34,36, 45, 67, 68};
        System.out.println("Printing Elements : "+number[2]);
        System.out.println("Printing Elements : "+number[3]);

        try{
            System.out.println("Printing Elements : "+number[6]);
        }
        catch(Exception e){
            System.out.println("Exception occurred : "+e);
        }
        finally{
            System.out.println("This is Finally Block It will always exicuted");
        }
        System.out.println("Printing Elements : "+number[4]);


    }

    public static void main(String[] args) {
        Demo_Arrays obj= new Demo_Arrays();
        obj.arrays();
    }
}
