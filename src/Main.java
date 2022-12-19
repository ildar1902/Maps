import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("        Урок карты и ассоциативные массивы");
//ДЗ-1. Задание 1.
        System.out.println("    ДЗ-1. Задание 1.");
        System.out.println();
        HashMap<String, String> phoneNumbers = new HashMap<>();
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
        System.out.println(phoneNumbers);
    }
}