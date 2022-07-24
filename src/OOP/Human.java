package OOP;

import java.util.Arrays;

public class Human {
    boolean isMale;
    String name;
    int age;

    //    access control using encapsulation paradigm
    private String complexionArray[] = {"fair", "dark"};
    private String complexion = complexionArray[0];

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

    public void setComplexion(String color){
        boolean exists = false;
        color = color.toLowerCase();
        System.out.println(color);
        for(int i = 0; i<this.complexionArray.length; i++){
            if(color == complexionArray[i]){
                exists = true;
                break;
            } else {
                exists = false;
            }
        }
        if(exists){
            complexion = color;
            System.out.println("Complexion set to " + color);
        }else{
            System.out.println("Color not in complexion list.");
        }
    }
    public void getComplexion(){
        System.out.println(complexion);
    }
}
