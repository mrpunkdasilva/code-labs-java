class User {
    private String name;
    private String address;
    private String phone;
    private Cart cart;

    public User(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.cart = new Cart(); // Composição: cada usuário tem um carrinho
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }

    public void displayUserInfo() {
        System.out.println("User  Info: ");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }

    @Override
    public String toString() {
        return "User  {name='" + name + "', address='" + address + "', phone='" + phone + "', cart=" + cart + "}";
    }
}