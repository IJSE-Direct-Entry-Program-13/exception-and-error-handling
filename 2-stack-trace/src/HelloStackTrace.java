public class HelloStackTrace {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        mainThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A. Don't worry I got you");
            }
        });
//        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("B. No matter who you are, don't worry ma thread I am here for you");
//            }
//        });

        new Thread(()-> {
            System.out.println("In: Main");
            myMethod1();
            System.out.println("Out: Main");
        }, "t1").start();
    }

    public static void myMethod1(){
        System.out.println("In: myMethod1");
        myMethod2();
        System.out.println("Out: myMethod1");
    }

    public static void myMethod2(){
        System.out.println("In: myMethod2");
        myMethod3();
        System.out.println("Out: myMethod2");
    }

    public static void myMethod3(){
        System.out.println("In: myMethod3");
        myMethod4();
        System.out.println("Out: myMethod3");
    }

    public static void myMethod4(){
        System.out.println("In: myMethod4");
        System.out.println(5 / 0);
        System.out.println("Out: myMethod4");
    }
}
