package loop;

public class continueIfNotBreak {

    static public void main (String args[]) {
        int target = 50;
        int guess = 0;

        while (target != guess)
        {
            guess += 10;
            System.out.println("Guessing number was " + guess);
        }

        System.out.println("target number was " + guess);
    }
}
