import java.util.Scanner;

public class ShopOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um usuário
        User user = new User("Alice", "123 Main St", "555-1234");

        // Criando alguns produtos
        Product product1 = new Product("Laptop", 1200.00f);
        Product product2 = new Product("Smartphone", 800.00f);
        Product product3 = new Product("Tablet", 300.00f);

        // Menu interativo
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Remover produto do carrinho");
            System.out.println("3. Ver produtos no carrinho");
            System.out.println("4. Ver total do carrinho");
            System.out.println("5. Aplicar desconto");
            System.out.println("6. Limpar carrinho");
            System.out.println("7. Ver informações do usuário");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Escolha um produto para adicionar:");
                    System.out.println("1. Laptop");
                    System.out.println("2. Smartphone");
                    System.out.println("3. Tablet");
                    int productChoice = scanner.nextInt();
                    switch (productChoice) {
                        case 1:
                            user.getCart().addProduct(product1);
                            break;
                        case 2:
                            user.getCart().addProduct(product2);
                            break;
                        case 3:
                            user.getCart().addProduct(product3);
                            break;
                        default:
                            System.out.println("Produto inválido.");
                    }
                    break;
                case 2:
                    System.out.println("Escolha um produto para remover:");
                    System.out.println("1. Laptop");
                    System.out.println("2. Smartphone");
                    System.out.println("3. Tablet");
                    int removeChoice = scanner.nextInt();
                    switch (removeChoice) {
                        case 1:
                            user.getCart().removeProduct(product1);
                            break;
                        case 2:
                            user.getCart().removeProduct(product2);
                            break;
                        case 3:
                            user.getCart().removeProduct(product3);
                            break;
                        default:
                            System.out.println("Produto inválido.");
                    }
                    break;
                case 3:
                    System.out.println("Produtos no carrinho: " + user.getCart().getProducts());
                    break;
                case 4:
                    System.out.println("Total no carrinho: " + user.getCart().getTotal());
                    break;
                case 5:
                    System.out.print("Digite a porcentagem de desconto: ");
                    float discount = scanner.nextFloat();
                    user.getCart().applyDiscount(discount);
                    System.out.println("Desconto aplicado.");
                    break;
                case 6:
                    user.getCart().clearCart();
                    System.out.println("Carrinho limpo.");
                    break;
                case 7:
                    user.displayUserInfo();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}