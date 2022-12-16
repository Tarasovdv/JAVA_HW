package HW3;

import java.util.ArrayList;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            arrList.add(rand.nextInt(100));
        }
        System.out.println(arrList);
        int sum = 0;
        int min = arrList.get(0);
        int max = arrList.get(0);
        for (Integer item: arrList) {
            if (item < min) {
                min = item;
            }
            if (item > max) {
                max = item;
            } 
            
            sum += item;
             
        }
        float odd = sum/arrList.size();
        System.out.println("max = "+max);
        System.out.println("mim = "+min);
        System.out.println(odd);
    }
}
