import java.util.HashMap;
import java.util.Map;

public class WearHouse {

    private Map<String, Integer> map;

    public WearHouse() {
        this.map = new HashMap();
    }

    public void addProduct(Product product, int quantity) {
        Integer count = map.get(product);
        if (count == null) {
            map.put(product.getName(), quantity);
        } else {
            map.remove(product);
            map.put(product.getName(), count + quantity);
        }
    }

    public void removeProduct(Product product, int quantity) {
        Integer count = map.get(product);
        if (count == null) {
            System.out.println("The product is not found!");
            return;
        } else if (quantity - count > 0) {
            System.out.println("In wearhouse is not the quantity you need!");
        } else {
            map.remove(product);
            map.put(product.getName(), count - quantity);
        }
    }

    public Integer getProductQuantity(Product product) {
        return map.get(product);
    }
}
