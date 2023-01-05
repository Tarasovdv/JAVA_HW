package OOP.OOP_HW1;

public class Communication {

    private Person person1;
    private Person person2;
    private TypeCommunication typeCommun;

    public Communication(Person person1, Person person2, TypeCommunication typeCommun) {
        this.person1 = person1;
        this.person2 = person2;
        this.typeCommun = typeCommun;
    }

    public Person getPerson2() {
        return person2;
    }
    
}
