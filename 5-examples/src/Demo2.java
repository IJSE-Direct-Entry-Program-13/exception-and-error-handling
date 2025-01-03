public class Demo2 {
    public static void main(String[] args) {
        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("I am about to exit");
            }
        });
        System.out.println("In: main");
        myMethod1();
        System.out.println("Out: main");
    }
    public static void myMethod1(){
        System.out.println("In: myMethod1");
        try {
            System.out.println("ijse".substring(2, myMethod2(10, 0) - 10));
        }catch (ArithmeticException e){
            System.out.println("Got an exception");
        }finally {
            if (true) return;
        }
        System.out.println("Out: myMethod1");
    }
    public static int myMethod2(int num1, int num2){
        System.out.println("In: myMethod2");
        try {
            return num1 / num2;
        }catch (ArithmeticException e){
            return num1;
        }finally {
            System.out.println("Out: myMethod2");
        }
    }
}
