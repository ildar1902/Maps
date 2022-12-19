package product;
import java.util.HashMap;

public class ProductList {

    private final HashMap<Product, Double> products;
    private String name;

    public ProductList(HashMap<Product, Double> products, String name) {
        this.products = products;
        this.name = name;
    }

    public HashMap<Product, Double> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        if (products.containsKey(product)) {
            throw new IllegalArgumentException("В списке уже есть " + product.getName());
        }
        products.put(product, (product.getVolume()* product.getPrice()));
        System.out.println("Вы добавили " + product.getName());

    }

    public void remove(Product product) {
        products.remove(product);
        System.out.println("Убрали из списка " + product.getName());
    }

    @Override
    public String toString() {
        return "В " + getName() +  " списке: " + products.toString();
    }
}
