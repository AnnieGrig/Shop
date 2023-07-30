public class DigitalProduct extends Product {
    private int size;

    public DigitalProduct(String name, int price, int size) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
