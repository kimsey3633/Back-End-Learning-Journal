package calculator;

import java.util.Scanner;

public class addMinus {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int operand1 = scanner.nextInt();
        int operand2 = scanner.nextInt();
        String temp = scanner.nextLine();
        String operator = scanner.nextLine();

        if (operator.equals("+"))
            System.out.println(operand1 + operand2);
        else if (operator.equals("-"))
            System.out.println((operand1 - operand2));
    }
}
