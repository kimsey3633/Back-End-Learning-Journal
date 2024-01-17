package condition;

public class newSwitch {

    public static void main(String args[]) {
        char grade = 'C';

        double gpa = switch (grade) {
            case 'A' -> 4.0;
            case 'B' -> 3.0;
            case 'C' -> 2.0;
            case 'D' -> 1.0;
            case 'F' -> 0.0;
            default -> 0.0;
        };

        if (gpa < 3.0)
            System.out.println("Your gpa is " + gpa + " Please reconsider you major");
        else
            System.out.println(("Your gpa is " + gpa));
    }

}
