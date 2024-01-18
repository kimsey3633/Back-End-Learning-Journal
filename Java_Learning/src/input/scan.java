package input;

import java.util.Scanner;

public class scan {

    static public void main(String args[]) {
        Scanner scanner = new Scanner (System.in);
        String str = scanner.nextLine();
        System.out.println(str);

        int num = scanner.nextInt();
        System.out.println(num);
    }

}
