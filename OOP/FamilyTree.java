package OOP;

import java.util.ArrayList;

public class FamilyTree {
    private ArrayList<Person> treePerson = new ArrayList<Person>();

    /* public void printTree(Person tree, String table) {
        if (tree != null) {
            System.out.println(table + tree.name);
        } else {
            System.out.println(table + "null");
            return;
        }

        for (int i = 0; i < tree.children.size(); i++) {
            printTree(tree.children.get(i).getP2(), table + "  ");

        }
    } */
    public void addPerson(Person person) {
        treePerson.add(person);
    }

    public void printTree(Person tree, String table) {
        if (tree != null) {
            System.out.println(table + tree.getName());
        } else {
            System.out.println(table + "null");
            return;
        }

        for (int i = 0; i < tree.getComm().size(); i++) {
            printTree(tree.getComm().get(i).getP2(), table + "  ");

        }
    }
}
