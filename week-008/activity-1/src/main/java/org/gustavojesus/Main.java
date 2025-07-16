package org.gustavojesus;

public class Main {
    
    // Princípio KISS (Keep It Simple, Stupid)
    // Este princípio sugere que o código deve ser o mais simples possível,
    // evitando complexidade desnecessária. Aqui, adicionamos validação básica para melhorar a robustez.
    public static int sum(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Os números não podem ser negativos");
        }
        return a + b; // Simples e direto, sem lógica desnecessária.
    }

    // Princípio DRY (Don't Repeat Yourself)
    // Este princípio enfatiza a reutilização de código, evitando duplicação desnecessária.
    // Criamos um método genérico para cálculos matemáticos reutilizáveis.
    public static double calculateArea(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensões devem ser maiores que zero");
        }
        return width * height;
    }
    
    public static double calculateCircleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero");
        }
        return Math.PI * Math.pow(radius, 2);
    }

    // Princípio YAGNI (You Ain't Gonna Need It)
    // Este princípio sugere que não devemos adicionar funcionalidades que não são necessárias no momento.
    // Em vez de criar métodos desnecessários, garantimos que a função atenda apenas ao propósito imediato.
    public static void printFormattedMessage(String message, boolean uppercase) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("A mensagem não pode ser vazia");
        }
        if (uppercase) {
            System.out.println(message.toUpperCase());
        } else {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        // Testando os princípios
        try {
            System.out.println("Soma: " + sum(5, 10));
            System.out.println("Área Retângulo: " + calculateArea(5, 4));
            System.out.println("Área Círculo: " + calculateCircleArea(3));
            printFormattedMessage("Princípios de codificação aplicados!", true);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
