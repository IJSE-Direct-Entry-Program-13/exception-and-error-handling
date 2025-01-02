import java.util.Calendar;

public class Rule3 {
    public static void main(String[] args) {
        try {

        } catch (/* final */ NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            //e = null;     // e implicitly final here
        }

        try {

        }catch (NullPointerException e){
            e = null;
        }

//        try {
//        }catch (String s){}

//        try {
//        }catch (Calendar e){}
    }
}
