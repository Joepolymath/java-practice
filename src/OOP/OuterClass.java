package OOP;

public class OuterClass {
    String outerMessage = "This is the outer class";
    class InnerClass{
        String message = "This is the inner class";
    }
    public static void main(String[] args){
        OuterClass obj1 = new OuterClass();
        System.out.println(obj1.outerMessage);

        OuterClass.InnerClass obj2 = obj1.new InnerClass();
        System.out.println(obj2.message);
    }
}
