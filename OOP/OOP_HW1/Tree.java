package OOP.OOP_HW1;

import java.util.ArrayList;

public class Tree {
    private ArrayList<Person> personList = new ArrayList<Person>();;

    /*
     * public Tree(ArrayList<Person> personList) {
     * this.personList = personList;
     * }
     * public Tree() {
     * }
     */

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void add_person(Person person) {
        personList.add(person);
    }

    public void printTree(Person person, String table) {
        if (person != null) {
            System.out.println(table + person.getName);
        } else {
            System.out.println(table + "null");
            return;
        }
        for (int i = 0; i < person.comm.size(); i++) {
            printTree(person.comm.get(i).getPerson2(), table + "  ");
        }
    }

}
