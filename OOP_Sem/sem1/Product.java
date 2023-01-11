package OOP_Sem.sem1;

public class Product {
    private String nameProduct;
    private double cost;

    public Product(String nameProduct, double cost) {
        this.nameProduct = nameProduct;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        }

    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "Product {" + "nameProduct: " + nameProduct + 
        ", cost = " + cost + "} \n";
    }

}
