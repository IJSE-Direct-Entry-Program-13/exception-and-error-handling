import java.io.FileInputStream;
import java.io.IOException;

public class Rule2 {

    public static void main(String[] args) {

        try{
            Class.forName("abc");
        }catch(ClassNotFoundException e){
        }

        try {
            new FileInputStream("hello.txt");
        }catch (IndexOutOfBoundsException e){
        }catch (RuntimeException e){
        }catch (Error e){
        }catch(IOException e){
        }

        try {
        }catch (Exception e){
        }

        try {
        }catch (Throwable e){
        }

    }
}
