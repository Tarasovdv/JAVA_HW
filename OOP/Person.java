package OOP;

import java.util.ArrayList;

public class Person {
    private String name;
    private String sex;
    private int birthDate;
    private int deathDate;
    private ArrayList<Communication> comm = new ArrayList<Communication>();
    // int age;
    // ArrayList<Communication> children = new ArrayList<Communication>();

    public String getName() {
        return name;
    }

    public Person(String name, String sex, int birthDate, int deathDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.deathDate = deathDate;

    }

    public ArrayList<Communication> getComm() {
        return comm;
    }

    public int getDeathDate() {
        return deathDate;
    }

    /*
     * public int getAge() {
     * return age;
     * }
     * public ArrayList<Communication> getChildren() {
     * return children;
     * }
     */

    /*
     * public Person (String name){
     * this.name = name;
     * }
     * public Person (String name, int age){
     * this.name = name;
     * this.age = age;
     * }
     * public Person (String name, int age, ArrayList<Communication> children){
     * this.name = name;
     * this.age = age;
     * this.children = children;
     * }
     * public Person (String name, ArrayList<Communication> children){
     * this.name = name;
     * this.children = children;
     * }
     */

    /*
     * public void printRelatives(int degree) {
     * ArrayList<Communication> list = this.getChildren();
     * System.out.println("degree of kinship: " + degree + ", for " + this.name);
     * for (int i = 0; i < list.size(); i++) {
     * if (list.get(i).p1 != this && list.get(i).degree2 == degree) {
     * System.out.println("Name: " + list.get(i).p2.name + ", ");
     * System.out.println("Age: " + list.get(i).p2.age + ", ");
     * System.out.println("degree of kinship: " + list.get(i).degree2);
     * }
     * }
     * }
     */

    /*
     * public void addCommunication(Person p2, int degree1, int degree2) {
     * this.children.add(new Communication(this, p2, 1, 2));
     * }
     */

    public void addCommunication(Person p2, TypeCommunication comm1, TypeCommunication comm2) {
        this.comm.add(new Communication(this, p2, comm1, comm2));
    }

    @Override
    public String toString() {
        if (this.getDeathDate() == 0) {
            return "Name: " + name + ", sex: " + sex + ", birth: " + birthDate;
        } else {
            return "Name: " + name + ", sex: " + sex + ", birth: " + birthDate + ", death: " + deathDate;
        }

    }
}
