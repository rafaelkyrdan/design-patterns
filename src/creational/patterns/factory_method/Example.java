package creational.patterns.factory_method;

/**
 * Example shows that we can create different instances of parsers which we can use at runtime.
 */

public class Example {
    public static void main(String[] args) {

        DisplayService service;

//        Here we can add a logic, conditions and other influencing factors
//        Based on it we can desided what implementation we need.

        service = new FeedbackDisplayService();
        service.display();

        service = new ErrorDisplayService();
        service.display();

        service = new OrderDisplayService();
        service.display();

        service = new ResponseDisplayService();
        service.display();
    }
}
