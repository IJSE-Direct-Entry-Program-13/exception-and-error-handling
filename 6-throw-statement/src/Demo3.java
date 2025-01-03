public class Demo3 {

    public static void main(String[] args) {
        execute();
    }

    public static void execute()  {
        loadClasses();
    }

    public static void loadClasses()  {
        try {
            Class.forName("Demo");
            Class.forName("abc");
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
