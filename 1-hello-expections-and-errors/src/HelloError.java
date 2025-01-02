import java.util.ArrayList;

public class HelloError {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        while (true) list.add(new HelloError());
    }
}
