package structural.patterns.bridge;

/**
 * It is a subclass of product for brand B.
 * It has a specific implementation of methods assemble and produceProduct.
 */

public class ProductForBrandB extends Product {

    private final Detail detail;
    private final String carType;

    public ProductForBrandB(Detail detail, String carType) {
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
