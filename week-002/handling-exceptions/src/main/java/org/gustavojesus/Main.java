package org.gustavojesus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        MySet mySet = new MySet();

        System.out.println("Insira números positivos para adicionar ao conjunto. Para encerrar, insira um número negativo.");

        while (true) {
            System.out.print("Digite um número: ");
            int input = scanner.nextInt();

            // encerra se um número negativo for inserido
            if (input < 0) {
                break;
            }

            try {
                mySet.add(input);
                System.out.println("Número adicionado: " + input);
            } catch (ValueAlreadyExistsException e) {
                System.out.println("Mensagem de exceção: " + e.getMessage());
            } catch (InvalidValueException e) {
                System.out.println("Mensagem de exceção: " + e.getMessage());
            }
        }

        System.out.println("Execução encerrada.");
        scanner.close();
    }
}
