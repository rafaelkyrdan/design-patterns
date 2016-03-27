package builder;

/**
 * It's a Director which is responsible for invoking different builder
 * methods required for the construction of the final object.
 */

public class Director {

    private ProductBuilder builder;

    public void setBuilder(ProductBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildProperty1();
        builder.buildProperty2();
        builder.buildProperty3();
        builder.buildProperty4();
        builder.buildProperty5();
    }

    public Product getProduct() {
        return builder.getProduct();
    }

    public Director(ProductBuilder builder) {
        this.builder = builder;
    }
}
