package product;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private HashMap<Product, Double> productList;
    private Double count;
    private String name;

    public Recipe(HashMap<Product, Double> productList, Double count, String name) {
        this.productList = productList;
        this.count = count;
        this.name = name;
    }

    public HashMap<Product, Double> getProductList() {
        return productList;
    }

    public void setProductList(HashMap<Product, Double> productList) {
        this.productList = productList;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Рецепт под названием " + getName() + ", который содержит: " + productList + String.format("%n") +
                "общая стоимость продуктов в рецепте: " + count + " рублей";
    }
}
