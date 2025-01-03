public class Demo1 {

    public static void main(String[] args) {
        System.out.println("In: Main");
        try {
            myMethod1();
        }catch (Exception e) {
            System.out.println("Got Exception");
        }
        System.out.println("Out: Main");
    }

    public static void myMethod1() {
        System.out.println("In: myMethod1");
        System.out.println(myMethod2());
        System.out.println("Out: myMethod1");
    }

    public static String myMethod2() {
        System.out.println("In: myMethod2");
        String s = Math.random() < 0.5 ? null : "ijse";
        try {
            return s.toUpperCase();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Got it");
            return "Hello";
        }finally{
            System.out.println("Out: myMethod2");
        }
    }

}
