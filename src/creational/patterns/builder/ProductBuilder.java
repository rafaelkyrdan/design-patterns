package creational.patterns.builder;

/**
 * The ProductBuilder is the creational.patterns.builder interface contains set of common
 * methods used to build the product object and its components.
 * The getProduct method is used to return the final product object to the client after its construction.
 */

public interface ProductBuilder {

    public void buildProperty1();

    public void buildProperty2();

    public void buildProperty3();

    public void buildProperty4();

    public void buildProperty5();

    public Product getProduct();
}

/**
 * Let’s see two implementations of the ProductBuilder interface, one for each type of product, i.e., for A and B.
 */



