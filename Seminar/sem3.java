package Seminar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class sem3 {
    public static void main(String[] args) {

        /*
         * String s1 = "hello";
         * String s2 = "hello";
         * String s3 = s1;
         * String s4 = "h" + "e" + "l" + "l" + "o";
         * String s5 = new String("hello");
         * String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });
         * 
         * System.out.println("\n" + s1 + " == " + s5 + " --> " + (s1 == s5));
         * System.out.println("\n" + s1 + " equals " + s5 + " --> " + (s1.equals(s5)));
         */

        // task1();
        //task2_1();
        //task2();
        task3();

    }

    public static void task1() {
        // заполнить 10 случайными числами
        // отсорттровать sort()
        ArrayList<Integer> arrList = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            arrList.add(new Random().nextInt(100));
        }
        System.out.println(arrList);
        Collections.sort(arrList);
        System.out.println(arrList);
    }

    public static void task2_1() {
        // заполнить список назв.планет Солн.сист. в произв порядке с повторениями.
        // вывести назв каждой планеты и количество повторений
        // пройтись по списку из предыдущего задания и удалить повт. элементы.
        ArrayList<String> planets = new ArrayList<String>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Плутон");
        planets.add("Нептун");
        Random rand = new Random();
        System.out.println(planets);
        ArrayList<String> new_planets = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            int random = rand.nextInt(0, 9);
            new_planets.add(planets.get(random));

        }
        System.out.println(new_planets);
        int count = 0;
        for (int i = 0; i < planets.size(); i++) {
            for (int j = 0; j < new_planets.size(); j++) {
                if (planets.get(i).equals(new_planets.get(j))) {
                    count++;
                }
                if (count>1){
                    new_planets.remove(j);
                }
            }
            System.out.println(planets.get(i) + ": встречается " + count + " раз");
            count = 0;
        }

        System.out.println(new_planets);
    }

    public static void task2() {
        //создать список типа ArrayList<String>
        //поместить строки и целые
        //пройти по списку и удалить целые.
        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scan.next());
        }
        System.out.println(list);
        int in = 0;
        for (int i = 0; i < list.size(); i++) {
            try{
                in = Integer.parseInt(list.get(i));
                list.remove(i);
            } catch (NumberFormatException e){

            }
        }
        System.out.println(list);

    }

    /**
     * 
     */
    private static void task3() {
        //каталог товаров книжн магаз.сохранен в виде двумерного масс. List<ArrayList<String>>так что на 0-й позиции каждого внутр списка - жанр,
        // а на остальных - названия книг. написать метод для заполнения данной структуры.

        ArrayList<String> prosa = new ArrayList<>();
        prosa.add("проза");
        prosa.add("W&W");
        prosa.add("12 style");

        final List<ArrayList<String>> mix_arr = new ArrayList<>();

        mix_arr.add(prosa);
        System.out.println(prosa);
        System.out.println(mix_arr);

        prosa.clear();
        prosa.add("поэзия");
        prosa.add("ddd");

        mix_arr.add(prosa);
        System.out.println(mix_arr);
        

        
    }

}
