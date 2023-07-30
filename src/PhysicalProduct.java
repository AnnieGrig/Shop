public class PhysicalProduct extends Product{

    private double weight;

    public PhysicalProduct(String name, int price, double weight) {
        super(name, price);
        this.weight =weight;
    }

    public double getWeight() {
        return weight;
    }
}
