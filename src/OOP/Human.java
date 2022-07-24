package OOP;

public class Human {
    boolean isMale;
    String name;
    int age;

//    trying out constructors
    public Human(String Name, int Age, boolean IsMale){
        name = Name;
        age = Age;
        isMale = IsMale;
    }

    public void grow(){
        System.out.println(name + " is growing");
    }
}
