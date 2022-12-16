package HW3;

import java.util.ArrayList;
import java.util.Random;

public class task2 {

    // Пусть дан произвольный список целых чисел, удалить из него четные числа
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            arrList.add(rand.nextInt(100));
        }
        System.out.println(arrList);

        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        } 
        
        System.out.println(arrList);
    }

}
