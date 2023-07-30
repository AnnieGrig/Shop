public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Phone", 1000);
        Product product2 = new Product("Computer", 2000);
        Product product3 = new Product("Airpods", 200);

        PhysicalProduct product = new PhysicalProduct("Comp", 1500, 2);
        DigitalProduct product4 = new DigitalProduct("Pen", 2, 5);

        Shop shop = new Shop();
        shop.addProduct(product1);
        shop.addProduct(product);
        shop.addProduct(product4);

        Customer men = new Customer(10000);
        men.addProductToCart(shop.getProduct("Comp"));
        men.addProductToCart(shop.getProduct("Pen"));

        System.out.println(men.getBalance());
        men.purchase();

        System.out.println(men.getBalance());
    }
}