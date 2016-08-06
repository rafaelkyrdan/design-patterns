package structural.patterns.bridge;

/**
 * The abstraction, the Product class which holds a reference of a detail
 * type and provides two abstract methods produceProduct() and assemble().
 */

public abstract class Product {

    private final Detail detail;
    private final String carType;

    public Product(Detail detail, String carType) {
        this.detail = detail;
        this.carType = carType;
    }

    public abstract void assemble();

    public abstract void produceProduct();

    public void printDetails() {
        System.out.println("Product: " + carType + ", Detail:" + detail.productName());
    }
}
