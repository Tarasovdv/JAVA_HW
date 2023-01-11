package Seminar;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class sem5 {
    // создать структуру для хранения Номеров паспортов и фамилий
    // вывести данные по сотр.Иванов
    public static void main(String[] args) {
        /*
         * Map<Integer, String> table = new Hashtable<>();
         * 
         * table.put(123456, "Иванов");
         * table.put(321456, "Васильев");
         * table.put(654321, "Иванов");
         * 
         * for (int item : table.keySet()) {
         * if (table.get(item) == "Иванов") {
         * System.out.println(item + " " + table.get(item));
         * }
         * }
         */

        // написать метод который определяет изоморфны ли слова()строки

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String str1 = scan.next();
        System.out.println("Введите второе слово");
        String str2 = scan.next();

        Boolean flag = true;
        System.out.println(str1);
        System.out.println(str2);

        if (str1.length() != str2.length()) {
            flag = false;
        } else {
            Map<String, String> isomorph = new HashMap<>();
            for (int i = 0; i < str1.length(); i++) {
                if (isomorph.size() > 0) {
                    if (isomorph.get(str1.substring(i, i + 1)).equals(str2.substring(i, i + 1))) {
                        isomorph.put(str1.substring(i, i + 1), str2.substring(i, i + 1));

                    } else {
                        flag = false;
                    }
                } else {
                    isomorph.put(str1.substring(i, i + 1), str2.substring(i, i + 1));
                }

            }

        }
        System.out.println(flag);

    }

}
