package org.gustavojesus;

public class Main {
    public static void main(String[] args) {
        // Testando conta corrente com cartão de crédito
        Account c1 = new Account(500);
        CreditCard t1 = new CreditCard(500);
        t1.setAccount(c1);
        t1.withdraw(50);
        System.out.println("Saldo da conta c1: " + c1.getBalance());

        // Testando cartão de crédito com limite
        Account c2 = new Account(100);
        CreditCard t2 = new CreditCard(500);
        t2.setAccount(c2);
        t2.withdraw(50);
        System.out.println("Saldo da conta c2: " + c2.getBalance());
        System.out.println("Limite restante no t2: " + (500 - 50));

        // Testando cartão pré-pago
        PrepaidCard t3 = new PrepaidCard(100);
        t3.withdraw(100);
        System.out.println("Conta pré-paga desativada: " + t3.isDisabled());
    }
}
