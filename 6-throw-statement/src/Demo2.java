public class Demo2 {

    public static void main(String[] args) {
        System.out.println("in: main");
        myMethod1();
        System.out.println("out: main");
    }
    public static void myMethod1(){
        System.out.println("in: myMethod1");
        try {
            myMethod2();
        }catch (Exception e){
            System.out.println("Give me anything, I will handle");
        }
        System.out.println("out: myMethod1");
    }
    public static void myMethod2(){
        System.out.println("in: myMethod2");
        try {
            System.out.println(5 / 0);
        }catch (RuntimeException e){
            System.out.println("Okay let's see whether I can fix this");
            // Executed some login and found out that this can't be fixed
            throw e;
        }
        System.out.println("out: myMethod2");
    }
}
