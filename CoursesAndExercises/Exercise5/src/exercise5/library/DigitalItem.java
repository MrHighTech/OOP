package exercise5.library;

public class DigitalItem extends LibraryItem implements ItemWithCashDeposit {

    private String type;
    private double cashDepositAmount;

    public DigitalItem(int id, String name, String type, double cashDepositAmount) {
        super(id, name);
        this.type = type;
        this.cashDepositAmount = cashDepositAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCashDepositAmount() {
        return cashDepositAmount;
    }

    public void setCashDepositAmount(double cashDepositAmount) {
        this.cashDepositAmount = cashDepositAmount;
    }

    @Override
    public int getLoanPeriod() {
        return 30;
    }
}
