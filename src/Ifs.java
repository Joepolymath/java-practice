public class Ifs {
    public static void main(String[] args){
        System.out.println("Hello from Ifs");
        String name = "Joshua";
        int age = 1;
        if(age > 12 && age < 19){
            System.out.println("You are a teenager");
        } else{
            System.out.println("You are not a teenager");
        }
        String result = (name.indexOf("J") == 0) ? "You are a great guy" : "Okay, maybe you are great";
        System.out.println(result);
    }
}
