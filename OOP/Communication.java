package OOP;

public class Communication {
    private Person p1;
    private Person p2;
    private TypeCommunication typeCommun1;
    private TypeCommunication typeCommun2;
    // private int degree1;
    // private int degree2;

    public Person getP1() {
        return p1;
    }

    public Person getP2() {
        return p2;
    }

    public TypeCommunication getTypeCommun1() {
        return typeCommun1;
    }
    /*
     * public int getDegree1() {
     * return degree1;
     * }
     * public int getDegree2() {
     * return degree2;
     * }
     */

    public Communication(Person p1, Person p2, TypeCommunication typeCommun1,TypeCommunication typeCommun2) {
        this.p1 = p1;
        this.p2 = p2;
        this.typeCommun1 = typeCommun1;
        this.typeCommun2 = typeCommun2;
        // this.degree1 = degree1;
        // this.degree2 = degree2;
    }
}
