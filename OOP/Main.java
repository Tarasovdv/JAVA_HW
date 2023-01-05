package OOP;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();

        Person p1= new Person("Vladimir","male",1958,0);
        Person p2= new Person("Marina","female",1966,0);
        Person p3= new Person("Dmitriy","male",1992,0);
        Person p4= new Person("Victor","male",1947,0);
        Person p5= new Person("Elizaveta","female",2003,0);

        Person p6= new Person("Ivan","male",1905,1986);

        tree.addPerson(p1);
        tree.addPerson(p2);
        tree.addPerson(p3);
        tree.addPerson(p4);
        tree.addPerson(p5);

        p1.addCommunication(p3,TypeCommunication.FATHER,TypeCommunication.SON);
        p2.addCommunication(p3,TypeCommunication.MOTHER,TypeCommunication.SON);
        p2.addCommunication(p5, TypeCommunication.MOTHER,TypeCommunication.DAUGHTER);
        p4.addCommunication(p5, TypeCommunication.FATHER,TypeCommunication.DAUGHTER);
        p3.addCommunication(p5, TypeCommunication.BROTHER,TypeCommunication.SISTER);
       
        
        //System.out.println(tree);
        /* tree.treePerson.add(p1);
        tree.treePerson.add(p2);
        tree.treePerson.add(p3);
        tree.treePerson.add(p4); */
        

        /* p1.addCommunication(p2, 1, 2);
        p1.addCommunication(p3, 1, 2);
        p2.addCommunication(p4, 1, 2); */

        //p1.printRelatives(2);

        
        
        System.out.println(p1);
        System.out.println(p6);
        tree.printTree(p1, "_");
    }
    
}
