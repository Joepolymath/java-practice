package OOP;

public class Enums {
    enum Level {
        EASY,
        FAIR,
        HARD
    }

    public static void main(String[] args){
        Level levelVar = Level.HARD;
        System.out.println(levelVar);
    }
}
