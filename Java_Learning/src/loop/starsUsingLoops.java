package loop;

public class starsUsingLoops {

    static public void main (String args[]) {
        int size = 10;

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        for (int i = 0; i < size; i++)
        {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
