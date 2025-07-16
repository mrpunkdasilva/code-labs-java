package org.gustavojesus;

class DebitCard extends Card {
    @Override
    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}