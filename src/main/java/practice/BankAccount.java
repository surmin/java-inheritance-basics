package practice;

public class BankAccount {

    protected double amount;

    public BankAccount() {
        this.amount = 0;
    }

    public double getAmount() {
        return amount;
    }

    public void put(double amountToPut) {

        if (amountToPut > 0) {
            amount += amountToPut;
        }
    }

    public void take(double amountToTake) {

        if (amount - amountToTake >= 0) {
            amount -= amountToTake;
        }
    }
}
