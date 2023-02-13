package method_or_function;

public class Student {
    // study/ eat/ play..
    // SYNTAX : access_specifier return_type method_name (parameter) {code..}
    public void studyMethod() {
        System.out.println("This is Study Method");

    }

    public void eatMethod() {
        System.out.println("This is Eat Method");

    }

    public void playMethod() {
        System.out.println("This is Play Method");
    }

    public static void main(String[] args) {
        //SYNTAX : ClassName objName= new ClassName();
        Student obj= new Student();
        //SYNTAX : objName.MethodName();
        obj.studyMethod();
        obj.eatMethod();
        obj.playMethod();

    }
}