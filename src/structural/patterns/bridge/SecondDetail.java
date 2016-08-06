package structural.patterns.bridge;

/**
 * Another concrete implementation of detail.
 */

public class SecondDetail implements Detail {

    private final String productName;

    public SecondDetail(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Second Detail");
    }
}
