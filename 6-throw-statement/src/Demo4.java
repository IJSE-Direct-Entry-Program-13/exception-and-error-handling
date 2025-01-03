import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {
        final var SCANNER = new Scanner(System.in);
        System.out.print("Enter subject 1 marks:");
        double subject1 = SCANNER.nextDouble();
        System.out.print("Enter subject 2 marks:");
        double subject2 = SCANNER.nextDouble();
        System.out.print("Enter subject 3 marks:");
        double subject3 = SCANNER.nextDouble();
        try {
            System.out.println(findAvg(subject1, subject2, subject3));
        }catch (RuntimeException e) {
            System.out.println(e.getMessage() + " Please enter valid marks");
        }
    }

    public static String findAvg(double sub1Marks, double sub2Marks, double sub3Marks) {
        if (!isValidMarks(sub1Marks)) throw new InvalidSubjectMarksException();
        if (!isValidMarks(sub2Marks)) throw new InvalidSubjectMarksException();
        if (!isValidMarks(sub3Marks)) throw new InvalidSubjectMarksException();
        return "%.2f".formatted((sub1Marks + sub2Marks + sub3Marks) / 3);
    }

    private static boolean isValidMarks(double marks){
        return marks >= 0 && marks <= 100;
    }
}

class InvalidSubjectMarksException extends RuntimeException {
    public InvalidSubjectMarksException() {
        super();
    }

    public InvalidSubjectMarksException(String message) {
        super(message);
    }

    public InvalidSubjectMarksException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSubjectMarksException(Throwable cause) {
        super(cause);
    }
}
