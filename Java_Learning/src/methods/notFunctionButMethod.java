package methods;

public class notFunctionButMethod {
    static public void main(String args[]) {
        int start = 3333;
        collatz(start);
    }

    static public int collatz(int num) {
        System.out.println(num);
        if (num == 1)
            return 0;
        else if ((num % 2) == 1)
            return collatz(3 * num + 1);
        else
            return collatz(num / 2);
    }
}
