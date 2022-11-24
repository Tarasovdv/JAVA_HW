package Seminar;

import java.time.LocalDateTime;
import java.util.Scanner;

import javax.lang.model.util.ElementFilter;

public class seminar1 {
    public static void main(String[] args) {
        int i = 22;
        i *= 2;
        System.out.println(i);

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Input your name: ");
        // String name = scan.nextLine();
        // System.out.printf("Hi, bro, %s", name);
        // System.out.println(LocalDateTime.now().getHour());

        // greating();

        //вывести число максимальной непрерывной последовательности единиц
    /*  int[] arr = { 1, 1, 1, 0, 1, 1, 1, 1 };
        int count = 0;
        int max_count_1 = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1) {
                count++;
                if (max_count_1 < count) {
                    max_count_1 = count;
                }
            } else {
                count = 0;
            }

        }
        System.out.println(max_count_1);
    */
    /*
     * дан массив [3,2,2,3]  и число val = 3
     * ессли есть в массиве числа, равные заданному, нужно перенести эти элементы в конец массива.
     * таким образом ,первые несколько(все) элементы массива должны быть отличны от заданного, а остальные - равны ему.
     */
    }

    public static void greating() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = scan.nextLine();
        int nowHour = LocalDateTime.now().getHour();
        // int nowMinute = LocalDateTime.now().getMinute();
        System.out.printf("%d ", nowHour);
        if (nowHour >= 5 && nowHour < 12)
            System.out.printf("Good morning, %s", name);
        else if (nowHour >= 12 && nowHour < 18) {
            System.out.printf("Good afternoon, %s", name);
        } else if (nowHour >= 18 && nowHour < 24) {
            System.out.printf("Good evening, %s", name);
        }

    }

}
