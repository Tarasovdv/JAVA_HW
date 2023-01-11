package Seminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import Seminar.stack;

public class sem4 {
    public static void main(String[] args) {
        // программа замера скорости работы ArrayList & LinkedList
        /*
         * Random rand = new Random();
         * ArrayList<Integer> arr = new ArrayList<Integer>();
         * LinkedList<Integer> lin = new LinkedList<Integer>();
         * Scanner scan = new Scanner(System.in);
         * Long n, m;
         * 
         * m = System.currentTimeMillis();
         * for (int i = 0; i < 100000; i++) {
         * arr.add(rand.nextInt());
         * }
         * n = System.currentTimeMillis() - m;
         * System.out.println(n + " ms");
         * scan.nextLine();
         * 
         * m = System.currentTimeMillis();
         * for (int i = 0; i < 100000; i++) {
         * lin.add(rand.nextInt());
         * }
         * n = System.currentTimeMillis() - m;
         * System.out.println(n + " ms");
         * scan.nextLine();
         * 
         * m = System.currentTimeMillis();
         * for (int i = 0; i < 100000; i++) {
         * arr.remove(0);
         * }
         * n = System.currentTimeMillis() - m;
         * System.out.println(n + " ms");
         * scan.nextLine();
         * 
         * m = System.currentTimeMillis();
         * for (int i = 0; i < 100000; i++) {
         * lin.remove(0);
         * }
         * n = System.currentTimeMillis() - m;
         * System.out.println(n + " ms");
         * scan.nextLine();
         */

        /*
         * Реализовать консольное приложение, которое:
         * Принимает от пользователя строку вида
         * text~num
         * Нужно рассплитить строку по ~, сохранить text в связный список на позицию
         * num.
         * Если введено print~num, выводит строку из позиции num в связном списке и
         * удаляет её из списка.
         */

        /* Scanner user_string = new Scanner(System.in);
        String s = user_string.next();
        String[] text = new String[2];
        LinkedList<String> list = new LinkedList<>();

        while (!s.equals("end")) {

            text = s.split("~");
            // System.out.println(Arrays.toString(text));
            int pos_num = Integer.parseInt(text[1]);
            // System.out.println(pos_num);

            if (text[0].equals("print")) {
                System.out.println(list.get(pos_num));
                list.remove(pos_num);
            } else {
                list.add(pos_num, text[0]);
                System.out.println(list);

            }

            s = user_string.next();

        }
        System.out.println(list); */


        //реализовать свой стэк с помощью массива
        //реализ методы size(), empty(), push(), peek(), pop()

        stack<Integer> mass = new stack<>(10);
        System.out.println(mass.size());
        mass.push(1);
        mass.push(2);
        mass.push(43);
        System.out.println(mass.size());
        System.out.println(mass.peek());
        System.out.println(mass.pop());
        System.out.println(mass.size());
    }

}
