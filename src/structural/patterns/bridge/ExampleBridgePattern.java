package structural.patterns.bridge;

/**
 * Example show how to the Bridge Pattern works
 * We can easily change the dependencies in runtime because
 * we don't use inheritance between abstraction and implementation
 * instead we use composition.
 */

public class ExampleBridgePattern {

    public static void main(String[] args) {

        Detail detail = new FirstDetail("First Detail");
        Detail detail1 = new SecondDetail("Second Detail");

        Product product = new ProductForBrandA(detail, "Product for brand A - X model");
        product.produceProduct();
        product.assemble();
        product.printDetails();
        System.out.println();

        product = new ProductForBrandA(detail1, "Product for brand A - X2 model");
        product.produceProduct();
        product.assemble();
        product.printDetails();
        System.out.println();

        product = new ProductForBrandB(detail, "Product for brand B - Y model");
        product.produceProduct();
        product.assemble();
        product.printDetails();
        System.out.println();

        product = new ProductForBrandB(detail1, "Product for brand B - Y2 model");
        product.produceProduct();
        product.assemble();
        product.printDetails();
    }
}
