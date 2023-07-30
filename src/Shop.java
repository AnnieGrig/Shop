import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;
    private WearHouse wearHouse;

    private List<String> productsName;

    public Shop() {
        this.products = new ArrayList<>();
        this.wearHouse = new WearHouse();
        this.productsName = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (productsName.contains(product.getName())) {
            wearHouse.addProduct(product, 1);
        } else {
            wearHouse.addProduct(product, 1);
            productsName.add(product.getName());
            products.add(product);
        }

    }

    public void removeProduct(Product product) {
        if (productsName.contains(product.getName())) {
            wearHouse.removeProduct(product, 1);

            if (wearHouse.getProductQuantity(product) == 0) {
                productsName.remove(product.getName());
                products.remove(product);
            }
        } else {
            System.out.println("In warehouse is not product you need!");
        }
    }

    public Product getProduct(String name) {
        Product temp = null;
        for (Product product : products) {
            if (product.getName().equals(name)) {
                temp = product;
            }
        }
        if(temp == null) {
            System.out.println("Incorrect name!");
            return null;
        }
        return temp;
    }


}
