public class Order {
    private String buyer;
    private String product;

    public Order(Buyer b, Product p) {
        this.buyer = b.getName();
        this.product = p.getName();
    }

    public String getBuyer() {
        return this.buyer;
    }

    public String getProduct() {
        return this.product;
    }
}
