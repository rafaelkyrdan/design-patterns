package builder;

/**
 * Class Product and it's properties which describe it.
 */

public class Product {
    String property1;
    String property2;
    String property3;
    String property4;
    String property5;
    // ... and many other properties

    String type;

    public Product(String type) {
        this.type = type;
    }


    public String getProperty1() {
        return property1;
    }

    public String getProperty2() {
        return property2;
    }

    public String getProperty3() {
        return property3;
    }

    public String getProperty4() {
        return property4;
    }

    public String getProperty5() {
        return property5;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    public void setProperty3(String property3) {
        this.property3 = property3;
    }

    public void setProperty4(String property4) {
        this.property4 = property4;
    }

    public void setProperty5(String property5) {
        this.property5 = property5;
    }

    @Override
    public String toString() {
        return "Product " + "type " + type + "\n" +
                "property1='" + property1 + "\n" +
                ", property2='" + property2 + "\n" +
                ", property3='" + property3 + "\n" +
                ", property4='" + property4 + "\n" +
                ", property5='" + property5 + "\n";
    }
}
