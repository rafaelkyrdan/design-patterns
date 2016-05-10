package bridge;

/**
 * It is a subclass of product for brand A.
 * It has a specific implementation of methods assemble and produceProduct.
 */

public class ProductForBrandA extends Product {

    private final Detail detail;
    private final String carType;

    public ProductForBrandA(Detail detail, String carType) {
        super(detail, carType);
        this.detail = detail;
        this.carType = carType;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + detail.productName() + " for " + carType);
    }

    @Override
    public void produceProduct() {
        detail.produce();
        System.out.println("Modifing product " + detail.productName() + " according to - " + carType);
    }

}
