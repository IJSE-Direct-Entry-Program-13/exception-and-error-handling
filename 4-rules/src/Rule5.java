public class Rule5 {

    public static void main(String[] args) {
        System.out.println(myMethod1());
        System.out.println(myMethod2());
    }

    public static int myMethod1(){
        try{
            System.out.println("I am okay");
            return 10;
        }finally{
            System.out.println("Finally");
            return 5;
        }
    }

    public static int myMethod2(){
        try{
            return 5 / 0;
        }finally {
            return 5;
        }
    }
}
