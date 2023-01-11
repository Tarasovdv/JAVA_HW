package OOP_Sem.sem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static List list;

    public static void main(String[] args) {
        // List<Product> list = new ArrayList<>();
        VendingMachine vendingMachine = new VendingMachine();
        Product product = new Product("Alpen", 100);
        Product product2 = new Product("Milka", 90);
        Product product3 = new Bottle("Fanta", 90, 2);

        vendingMachine.addProduct(product);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine.getProductByCost(100));

    }

    

}
