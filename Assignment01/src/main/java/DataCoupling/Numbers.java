package DataCoupling;

public class Numbers {
    int numberA = 1;
    int numberB = 2;
    int numberC = 3;
    boolean allNumbersSet = true;
    Printer printer = new Printer();
    public void caller() {
        printer.print(numberA, numberB, numberC, allNumbersSet);
    }
}
