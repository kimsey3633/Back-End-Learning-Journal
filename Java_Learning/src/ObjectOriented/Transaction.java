package ObjectOriented;

public class Transaction {

    public static void main(String args[]) {
        fishcakeSeller Seller1 = new fishcakeSeller(20, 1000);
        fishcakeSeller Seller2 = new fishcakeSeller(40, 800);
        fishcakeSeller Seller3 = new fishcakeSeller(10, 1500);
        fishcakeBuyer Buying = new fishcakeBuyer(34200);

        Buying.buyFishcake(Seller1, 24500);
        Seller1.salesReport();
        Buying.report();
        Seller1.reviewUpdate((float) 4.8);
    }
}
