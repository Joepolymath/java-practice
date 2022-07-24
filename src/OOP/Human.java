package OOP;

import java.util.Arrays;

public class Human {
    boolean isMale;
    String name;
    int age;

    //    access control using encapsulation paradigm
    private String complexionArray[] = {"fair", "dark"};
    String complexion = complexionArray[0];

//    trying out constructors
    public Human(String Name, int Age, boolean IsMale){
        this.name = Name;
        this.age = Age;
        this.isMale = IsMale;
    }

    public void grow(){
        System.out.println(this.name + " is growing");
    }
    public String getComplexionArray(){
        return Arrays.toString(complexionArray);
    }
    public void setComplexionArray(String[] colorArray){
        this.complexionArray = colorArray;
    }
}
