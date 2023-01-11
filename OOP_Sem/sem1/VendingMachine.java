package OOP_Sem.sem1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> productList;

    public VendingMachine(List<Product> productList) {
        super();
        this.productList = productList;
    }

    public VendingMachine() {
        this(new ArrayList<>());
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductByCost(double cost) {
        List<Product> res = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCost() <= cost) {
                res.add(product);

            }
        }

        return res;

    }

}
