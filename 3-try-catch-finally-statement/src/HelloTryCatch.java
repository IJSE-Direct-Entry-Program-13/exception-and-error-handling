public class HelloTryCatch {

    public static void main(String[] args) {
        System.out.println("In: Main");
        try {
            myMethod1();
        }catch (Exception e) {
            System.out.println("Mata oni ekak...!");
        }catch (Throwable e) {
            System.out.println("Ai mata wada ekek ne...!");
        }finally{
            System.out.println("Dnnam athi math yanawa..!");
        }
        System.out.println("Out: Main");
    }
    public static void myMethod1()throws ClassNotFoundException{
        System.out.println("In: myMethod1");
        try {
            myMethod2();
        }finally{
            System.out.println("Menna mekenuth yano");
        }
        System.out.println("Out: myMethod1");
    }
    public static void myMethod2() throws ClassNotFoundException {
        System.out.println("In: myMethod2");
        try {
            System.out.println(5 / 0);
            Class.forName("hello");
        }catch (NullPointerException e){
            System.out.println("Null Pointer Ekak Aawo...!");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index eka pita panno...!");
        }finally {
            System.out.println("Try eken yanna yno...!");
        }
        System.out.println("Out: myMethod2");
    }
}
