import java.util.HashMap;
import java.util.Map;

public class Warehouse <T, K extends Number>{
    Map<Product<T>, K> inventory;

    public Warehouse() {
        inventory = new HashMap<>();
    }
    public void addProduct(Product<T> product, K quantity){
        inventory.put(product, quantity);
    }
    public void removeProduct(Product<T> product){
        inventory.remove(product);
    }
    public K getProductQuantity(Product<T> product){
        return inventory.getOrDefault(product, null);


    }
}
