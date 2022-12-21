package HW4;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> revList = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        revList = reverseList(list);
        System.out.println(revList);

    }

    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
    // вернет “перевернутый” список.

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> revList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            revList.add(list.get(i));  
        }
        return revList;
    }

}
