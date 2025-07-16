package org.gustavojesus;

class CreditCard extends Card {
    private double limit;

    public CreditCard(double limit) {
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= limit) {
            limit -= amount;
            account.withdraw(amount);
        }
    }
}