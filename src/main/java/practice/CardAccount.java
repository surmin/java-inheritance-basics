package practice;

public class CardAccount extends BankAccount {

    @Override
    public void take(double amountToTake) {
        if (amount - amountToTake * 1.01 >= 0) {
            amount -= amountToTake * 1.01;
        }
    }
}
