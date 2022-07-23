public class WhileLoop {
    public static void main(String[] args){
        int i = 0;
        while (i<100){
            System.out.println(i+1);
            i++;
        }

        int j = 0;
//        do while loop
        do {
            System.out.println("I am " + (j + 1));
            j++;
        }
        while (j<100);
    }
}
