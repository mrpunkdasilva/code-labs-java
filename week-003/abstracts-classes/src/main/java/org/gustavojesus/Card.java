package org.gustavojesus;

abstract class Card {
    protected Account account;

    public void setAccount(Account account) {
        this.account = account;
    }

    public abstract void withdraw(double amount);
}