public class Methods {
    public static void main(String[] args){
        printJ();
        System.out.println(add(5,2));
        int addResult = add(5, 7);
        System.out.println(addResult);
    }
    static void printJ(){
        System.out.println("I am a damn method");
    }
    static int add(int a, int b){
        return a + b;
    }
}
