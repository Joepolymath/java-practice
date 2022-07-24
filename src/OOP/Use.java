package OOP;

public class Use {
    public static void main(String[] args){
        Human best = new Human("Joshua", 25, true);

        System.out.println(best.name);
        best.grow();
        System.out.println(best.getComplexionArray());
        String newComplexions[] = {"black", "white"};
        best.setComplexionArray(newComplexions);
        System.out.println(best.getComplexionArray());
        best.setComplexion("White");
    }
}
