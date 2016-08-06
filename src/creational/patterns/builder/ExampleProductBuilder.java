package creational.patterns.builder;

/**
 * Created by raphaelkyrdan on 3/27/16.
 */
public class ExampleProductBuilder {

    public static void main(String[] args) {
        //build type A product
        ProductBuilder builder = new ProductATypeBuilder();
        Director director = new Director(builder);
        director.construct();
        Product productA = director.getProduct();

        System.out.println(productA);

        //build type A product
        builder = new ProductBTypeBuilder();
        director.setBuilder(builder);
        director.construct();
        Product productB = director.getProduct();
        System.out.println(productB);
    }
}
