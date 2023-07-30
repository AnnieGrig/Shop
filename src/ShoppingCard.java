import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCard {
    private List<String> box;
    private Map<String, Integer> map;

    private Map<String, Product> products;


    public ShoppingCard() {
        this.box = new ArrayList<>();
        this.map = new HashMap<>();
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (box.contains(product.getName())) {
            Integer count = map.get(product.getName());
            map.remove(product.getName());
            map.put(product.getName(), count + 1);
        } else {
            box.add(product.getName());
            map.put(product.getName(), 1);
            products.put(product.getName(), product);
        }
    }

    public void removeProduct(Product product) {

        if (box.contains(product.getName())) {
            Integer count = map.get(product);
            map.remove(product.getName());
            if (count == 1) {
                box.remove(product.getName());
                products.remove(product);
            } else {
                map.put(product.getName(), count - 1);
            }
        } else {
            System.out.println("Product not found!");
        }
    }

    public Integer getTotalPrice() {
        Integer result = 0;
        for (String key : map.keySet()) {
            result = map.get(key) * (products.get(key).getPrice());
        }
        return result;
    }
}
