package bridge;

/**
 * The concrete implementation of detail.
 */

public class FirstDetail implements Detail {
    private final String productName;

    public FirstDetail(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing First Detail ...");
    }
}
