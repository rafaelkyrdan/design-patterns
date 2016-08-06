package behavioral.patterns.template;

/**
 * The output of this example clearly shows how the behavioral.patterns.template pattern works
 * to connect and communicate with the different databases using the similar way.
 * The pattern keeps the common code under one class and promotes code re-usability.
 */

public class TemplatePatternExample {

    public static void main(String[] args) {

        System.out.println("For MYSQL....");
        ConnectionTemplate template = new MySqLCSVCon();
        template.run();

        System.out.println("For Oracle...");
        template = new OracleTxtCon();
        template.run();
    }
}
