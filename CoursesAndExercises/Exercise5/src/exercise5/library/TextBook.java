package exercise5.library;

public class TextBook extends Book implements ItemWithCashDeposit {

    private String subject;
    private double cashDepositAmount;

    public TextBook(int id, String name, String author, String subject, double cashDepositAmount) {
        super(id, name, author);
        this.subject = subject;
        this.cashDepositAmount = cashDepositAmount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setCashDepositAmount(double cashDepositAmount) {
        this.cashDepositAmount = cashDepositAmount;
    }

    @Override
    public int getLoanPeriod() {
        return 120;
    }

    @Override
    public boolean hasCashDeposit() {
        if (cashDepositAmount == 0) {
            return false;
        }
        return true;
    }

    @Override
    public double getCashDepositAmount() {
        return cashDepositAmount;
    }
}
