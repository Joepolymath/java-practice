package OOP;

public class OuterClass {
    String outerMessage = "This is the outer class";
    class InnerClass{
        String message = "This is the inner class";
    }

//    having a static class implies that you can access it without creating an object of the outer class.
    static class StaticClass{
        String staticMessage = "I am in the static class";
}

    public static void main(String[] args){
        OuterClass obj1 = new OuterClass();
        System.out.println(obj1.outerMessage);

        OuterClass.InnerClass obj2 = obj1.new InnerClass();
        System.out.println(obj2.message);

        StaticClass obj3 = new StaticClass();
        System.out.println(obj3.staticMessage);
    }
}
