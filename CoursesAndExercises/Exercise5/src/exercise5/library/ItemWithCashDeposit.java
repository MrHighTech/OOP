package exercise5.library;

public interface ItemWithCashDeposit {

    public default boolean hasCashDeposit() {
        return true;
    }

    public double getCashDepositAmount();

}
