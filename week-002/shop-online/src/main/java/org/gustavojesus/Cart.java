import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<Product> products;
    private float total;

    public Cart() {
        this.products = new ArrayList<>();
        this.total = 0.0f;
    }

    public void addProduct(Product product) {
        products.add(product);
        total += product.getPrice();
    }

    public void removeProduct(Product product) {
        if (products.remove(product)) {
            total -= product.getPrice();
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public float getTotal() {
        return total;
    }

    public void clearCart() {
        products.clear();
        total = 0.0f;
    }

    public void applyDiscount(float discountPercentage) {
        total -= total * (discountPercentage / 100);
    }

    @Override
    public String toString() {
        return "Cart{products=" + products + ", total=" + total + "}";
    }
}