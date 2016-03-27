package builder;

/**
 * Product A type builder.
 */

class ProductATypeBuilder implements ProductBuilder {

    private final Product product = new Product("A");

    @Override
    public void buildProperty1() {
        product.setProperty1("set property 1 to product A");
    }

    @Override
    public void buildProperty2() {
        product.setProperty2("set property 2 to product A");
    }

    @Override
    public void buildProperty3() {
        product.setProperty3("set property 3 to product A");
    }

    @Override
    public void buildProperty4() {
        product.setProperty4("set property 4 to product A");
    }

    @Override
    public void buildProperty5() {
        product.setProperty5("set property 5 to product A");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
