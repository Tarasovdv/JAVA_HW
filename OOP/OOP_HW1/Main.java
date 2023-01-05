package OOP.OOP_HW1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();
        ArrayList<Communication> comm = new ArrayList<>();

        Person person1 = new Person("Dmitriy", "male", 1992, 0,comm);
        Person person2 = new Person("Marina", "female", 1966, 0,comm);
        tree.add_person(person1);
        tree.add_person(person2);
        System.out.println(tree);
        System.out.println(person1);
        System.out.println(person2);

        person1.addCommunication(person1, person2, TypeCommunication.SON);
        tree.printTree(person2, " ");

    }

}
