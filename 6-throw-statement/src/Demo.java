public class Demo {
    public static void main(String[] args) {
        System.out.println("in: main");
        myMethod();
        System.out.println("out: main");
    }
    public static void myMethod(){
        System.out.println("in: myMethod");
        NullPointerException exp = new NullPointerException("Something went wrong");
        if (true) throw exp;
        System.out.println("out: myMethod");
    }
}
