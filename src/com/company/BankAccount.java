package com.company;

public class BankAccount {
    private double amount;


    public double getAmount() {
        return amount;

    }
    public void Deposit (double sum) throws LimitException {
        amount+=sum;
        System.out.println("Вы поплгили счет на" + (int)getAmount() + "Руб");
    }
    public void setAmount(double amount) {
        this.amount=amount;
    }
    public void withDraw(int sum) throws LimitException{
        if (sum>amount) {
            throw new LimitException("Недоступно. Недостаточно средств на счету", amount);
        }else  {
            amount -= sum;
        }
        System.out.println("Вы сняли" + sum + "руб" + "Остаток на счету" + amount);
    }
}
