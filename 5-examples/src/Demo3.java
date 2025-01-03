import java.time.Duration;

public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Found Uncaught Exception");
            }
        });
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Let's exit this is crazy");
            }
        });

        System.out.println("In: main");
        try {
            new Thread(Demo3::myMethod1).start();
        }catch (Exception e) {
            System.out.println("Got you");
        }
        System.out.println("Out: main");
    }
    public static void myMethod1(){
        System.out.println("In: myMethod1");
        try {
            System.out.println(myMethod2(10, 0));
        }catch (NumberFormatException | ArithmeticException e){
            System.out.println(new int[]{2,3}[3]);
        }finally{
            System.out.println("Time to exit from try");
        }
        System.out.println("Out: myMethod1");
    }
    public static int myMethod2(int d1, double d2){
        System.out.println("In: myMethod2");
        try {
            return (int) (d1 / d2);
        }catch (ArithmeticException e){
            System.out.println("Found: ArithmeticException");
        }finally{
            System.out.println("Out: myMethod2");
            try {
                return d1 / (int) d2;
            }catch (NullPointerException e){
                return d1;
            }finally {
                System.out.println("Out Inner Finally: myMethod2");
            }
        }
    }
}
