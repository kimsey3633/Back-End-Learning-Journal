package condition;

public class Cond
{

    public static void main(String args[])
    {
        int number = 30;

        if (number > 20)
        {
            System.out.println("number is bigger than 20!");
        }

        switch (number)
        {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }

}
