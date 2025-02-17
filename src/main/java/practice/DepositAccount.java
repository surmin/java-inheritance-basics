package practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {

    LocalDate lastIncome;

    @Override
    public void take(double amountToTake) {
        LocalDate today = LocalDate.now();
        if ((ChronoUnit.MONTHS.between(lastIncome, today)) >= 1) {
            if (amount - amountToTake >= 0) {
                amount -= amountToTake;
            }
        }
    }

    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amount += amountToPut;
            lastIncome = LocalDate.now();
        }
    }
}
