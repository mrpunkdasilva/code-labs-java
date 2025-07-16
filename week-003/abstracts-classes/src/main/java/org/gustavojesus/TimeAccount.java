package org.gustavojesus;

class TimeAccount extends Account {
    private boolean disabled;

    public TimeAccount(double initialBalance) {
        super(initialBalance);
        this.disabled = false;
    }

    @Override
    public void withdraw(double amount) {
        if (!disabled && amount > 0 && getBalance() >= amount) {
            super.withdraw(amount);
            if (getBalance() == 0) {
                disabled = true;
            }
        }
    }

    public boolean isDisabled() {
        return disabled;
    }
}
