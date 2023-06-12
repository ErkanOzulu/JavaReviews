package week15_17_12_2022.method_overriding.task1;

public class INGBank extends Bank {
    @Override
    public void calculateTheInterest() {
        super.calculateTheInterest();
        System.out.println(getCapital() * 9 / 100);
    }
}