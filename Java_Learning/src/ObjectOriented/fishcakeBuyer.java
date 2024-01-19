package ObjectOriented;

public class fishcakeBuyer {
    private int accountMoney;
    private int fishcakeCount = 0;
    public fishcakeBuyer(int money) {
        accountMoney = money;
    }

    public void report() {
        System.out.println("We have " + accountMoney + " won");
        System.out.println("We have " + fishcakeCount + " fishcakes");
    }

    public int buyFishcake(fishcakeSeller seller, int budget) {
        if (budget > accountMoney) {
            System.out.println("We can't spend that much!");
            return 0;
        }
        else
        {
            if (seller.distanceAccess() > 30)
            {
                System.out.println("That's way too far!");
                return 0;
            }

            if (seller.purchaseFishcake(budget) == -1)
            {
                System.out.println("We don't have enough money!");
                return 0;
            }

            accountMoney += seller.purchaseFishcake(budget) - budget;
            fishcakeCount += seller.justsoldAccess();
            return 0;
        }
    }
}
