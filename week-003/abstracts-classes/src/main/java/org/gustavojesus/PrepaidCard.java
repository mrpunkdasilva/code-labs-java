package org.gustavojesus;

class PrepaidCard extends Card {
    private TimeAccount timeAccount;

    public PrepaidCard(double initialBalance) {
        this.timeAccount = new TimeAccount(initialBalance);
    }

    public void setAccount(TimeAccount timeAccount) {
        this.timeAccount = timeAccount;
    }

    @Override
    public void withdraw(double amount) {
        timeAccount.withdraw(amount);
    }

    public boolean isDisabled() {
        return timeAccount.isDisabled();
    }
}
