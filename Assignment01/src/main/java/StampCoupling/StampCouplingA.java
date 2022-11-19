package StampCoupling;

public class StampCouplingA {
    private int[] array = {1, 2, 3, 4, 5};
    StampCouplingC c = new StampCouplingC();
    StampCouplingB b = new StampCouplingB();
    public void start() {
        b.callB(array, c);
    }
}
