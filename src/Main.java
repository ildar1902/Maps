import product.Product;
import product.ProductList;
import product.Recipe;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("        Урок карты и ассоциативные массивы");
//ДЗ-1. Задание 1.
        System.out.println("    ДЗ-1. Задание 1.");
        System.out.println();
        Map<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Иван Иванов", "+7 931 573 23 51");
        phoneNumbers.put("Иван Петров", "+7 932 571 63 55");
        phoneNumbers.put("Пётр Иванов", "+7 933 513 73 11");
        phoneNumbers.put("Пётр Петров", "+7 962 573 23 51");
        phoneNumbers.put("Алексей Лёхин", "+7 931 233 23 54");
        phoneNumbers.put("Фёдор Федяев", "+7 931 587 23 28");
        phoneNumbers.put("Антон Тохинченков", "+7 931 531 23 82");
        phoneNumbers.put("Андрей Дронин", "+7 931 946 23 51");
        phoneNumbers.put("Александр Сашинов", "+7 931 573 23 51");
        phoneNumbers.put("Семён Семёнов", "+7 931 400 23 51");
        phoneNumbers.put("Анастасия Табуреткина", "+7 931 682 52 51");
        phoneNumbers.put("Мария Степанова", "+7 931 529 24 21");
        phoneNumbers.put("Марина Кравец", "+7 986 238 23 51");
        phoneNumbers.put("Марьяна Зурабова", "+7 935 428 93 51");
        phoneNumbers.put("Ольга Лопатина", "+7 934 682 18 51");
        phoneNumbers.put("Жанна Стюардесова", "+7 931 556 93 18");
        phoneNumbers.put("Марсель Балиуллин", "+7 984 390 03 51");
        phoneNumbers.put("Рустам Демидов", "+7 945 321 67 91");
        phoneNumbers.put("Вадим Кукухин", "+7 998 432 50 34");
        phoneNumbers.put("Василий Бастов", "+7 937 782 98 31");

        for (Map.Entry<String, String> phone : phoneNumbers.entrySet()) {
            System.out.println("Контакт " + phone.getKey() + ": " + phone.getValue());
        }
        System.out.println();
//        ДЗ-1. Задание 2.
        System.out.println("    ДЗ-1. Задание 2.");
        Product banana = new Product("бананы", 89d, 2d);
        Product potato = new Product("картофель", 30d, 2d);
        Product apples = new Product("яблоки", 45d, 2d);
        Product oranges = new Product("апельсины", 55d, 2d);
        HashMap<Product, Double> products = new HashMap<>();

        ProductList productList = new ProductList(products, "1");
        System.out.println(productList);
        productList.addProduct(oranges);
        System.out.println(productList);
        productList.addProduct(banana);
        System.out.println(productList);
        productList.addProduct(potato);
        System.out.println(productList);
        productList.addProduct(apples);
        System.out.println(productList);
        System.out.println(calculatePrice(products));
        productList.remove(potato);
        System.out.println(productList);
        System.out.println(calculatePrice(products));
        Double amountCost1 = calculatePrice(products);

        Recipe recipeFirst = new Recipe(products, amountCost1, "\"Лёгкий фруктовый салат\"");
        System.out.println(recipeFirst);

    }

    public static Double calculatePrice(HashMap<Product, Double> products) {
        Double total = 0d;
        for (Double count : products.values()) {
            total += count;
        }
        return total;
    }
}