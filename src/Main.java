import product.Product;
import product.ProductList;
import product.Recipe;
import test.QwertyTest;

import java.util.*;

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

//        Дз-1. Задание 3
        System.out.println();
        System.out.println("    Дз-1. Задание 3");
        Map<String, Integer> map13 = new HashMap<>();
        QwertyTest test = new QwertyTest(map13);
        map13.put("qwerty", 10);
        map13.put("qwerty1", 11);
        map13.put("qwerty2", 12);
        map13.put("qwerty3", 14);
        map13.put("qwerty4", 15);
        map13.put("qwerty5", 16);
        System.out.println(map13);
        test.addTest("qwerty6", 20);
        System.out.println(map13);
        System.out.println();
//        Дз-2 Задание 1
        System.out.println("    Дз-2. Задание 1");
        Random random = new Random();
        List<Integer> numbersInt = new ArrayList<>();
        numbersInt.add(random.nextInt(1001));
        numbersInt.add(random.nextInt(1001));
        numbersInt.add(random.nextInt(1001));
        System.out.println(numbersInt);
        Integer total = 0;
        for (Integer item : numbersInt) {
            total += item;
        }
        List<Integer> numbersInt2 = new ArrayList<>();
        numbersInt2.add(random.nextInt(1001));
        numbersInt2.add(random.nextInt(1001));
        numbersInt2.add(random.nextInt(1001));
        System.out.println(numbersInt2);
        Integer total2 = 0;
        for (Integer integer : numbersInt2) {
            total2 += integer;
        }
        List<Integer> numbersInt3 = new ArrayList<>();
        numbersInt3.add(random.nextInt(1001));
        numbersInt3.add(random.nextInt(1001));
        numbersInt3.add(random.nextInt(1001));
        System.out.println(numbersInt3);
        Integer total3 = 0;
        for (Integer item : numbersInt3) {
            total3 += item;
        }
        List<Integer> numbersInt4 = new ArrayList<>();
        numbersInt4.add(random.nextInt(1001));
        numbersInt4.add(random.nextInt(1001));
        numbersInt4.add(random.nextInt(1001));
        System.out.println(numbersInt4);
        Integer total4 = 0;
        for (Integer integer : numbersInt4) {
            total4 += integer;
        }
        List<Integer> numbersInt5 = new ArrayList<>();
        numbersInt5.add(random.nextInt(1001));
        numbersInt5.add(random.nextInt(1001));
        numbersInt5.add(random.nextInt(1001));
        System.out.println(numbersInt5);
        Integer total5 = 0;
        for (Integer integer : numbersInt5) {
            total5 += integer;
        }
        Map<String, List<Integer>> map21 = new HashMap<>();
        map21.put("stringKey1", numbersInt);
        map21.put("stringKey2", numbersInt2);
        map21.put("stringKey3", numbersInt3);
        map21.put("stringKey4", numbersInt4);
        map21.put("stringKey5", numbersInt5);
        map21.forEach((key, value) -> System.out.println("Ключ: " + key + " -> " + value));
        Map<String, Integer> secondMap21 = new HashMap<>();
        secondMap21.put("stringKey1", total);
        secondMap21.put("stringKey2", total2);
        secondMap21.put("stringKey3", total3);
        secondMap21.put("stringKey4", total4);
        secondMap21.put("stringKey5", total5);
        secondMap21.forEach((key, value) -> System.out.println("Ключ: " + key + " -> " + value));
    }

    public static Double calculatePrice(HashMap<Product, Double> products) {
        Double total = 0d;
        for (Double count : products.values()) {
            total += count;
        }
        return total;
    }

}