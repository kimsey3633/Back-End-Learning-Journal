package ObjectOriented;

public class fishcakeSeller {
    private final int distance;
    private final int price;
    private float review;
    private int sales = 0;
    private int justsold = 0;

    public int distanceAccess() {
        return distance;
    }

    public fishcakeSeller(int dis, int pri) {
        distance = dis;
        price = pri;
    }

    public void reviewUpdate(float star) {
        review = star;
        System.out.println("Our rating is " + review + "/5");
    }

    public int purchaseFishcake(int money) {
        if (money > price) {
            justsold = money / price;
            sales += justsold;
            return money % price;
        }
        else
            return -1;
    }

    public int salesReport() {
        System.out.println("Sold " + sales + " fishcakes");
        return sales;
    }

    public int justsoldAccess() {
        return justsold;
    }
}
