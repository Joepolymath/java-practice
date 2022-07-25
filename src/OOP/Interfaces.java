package OOP;

interface Interfaces {
    public void saySomething();

    public void run(); // interface methods do not have body
}

class MyImplementer implements Interfaces{
    public void saySomething() {
        System.out.println("I am an implemented interface. Oh yeah!!!");
    }

    public void run() {
        System.out.println("I am running as an implemented interface. Boom yeah.");
    }
}

class Main{
    public static void main(String[] args){
        MyImplementer obj1 = new MyImplementer();
        obj1.run();
        obj1.saySomething();
    }
}