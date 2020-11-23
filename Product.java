public class Product {
    private String name;
    private int price;
    private String manufacturer;

    public Product(String name, int price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return this.name;
    }
}
