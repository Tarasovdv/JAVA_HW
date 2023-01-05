package OOP.OOP_HW1;

import java.util.ArrayList;

public class Person {
    private String name;
    private String sex;
    private int birthDate;
    private int deathDate;
    ArrayList<Communication> comm = new ArrayList<Communication>();
    public String getName;


    public Person(String name, String sex, int birthDate, int deathDate, ArrayList<Communication> comm) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.comm = comm;
    }

    public Person(String name, String sex, int birthDate, int deathDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        
    }

    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public int getBirthDate() {
        return birthDate;
    }
    public int getDeathDate() {
        return deathDate;
    }

    public ArrayList<Communication> getCommunication() {
        return comm;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", sex: " + sex + ", birth: " + birthDate;
    }

    public void addCommunication(Person person1, Person person2,TypeCommunication comm) {
        this.comm.add(new Communication(person1, person2,comm));       
    }
}
