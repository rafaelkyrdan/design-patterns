package creational.patterns.factory_method;

/**
 * The interface is used by different parsers.
 * Each parser implements interface and is used to parse a specific message.
 */

public interface Parser {
    String parse();
}

class ErrorParser implements Parser {

    @Override
    public String parse() {
        System.out.println("Parsing error ...");
        return "Error message";
    }
}

class FeedbackParser implements Parser {

    @Override
    public String parse() {
        System.out.println("Parsing feedback ...");
        return "Feedback message";
    }
}

class OrderParser implements Parser {

    @Override
    public String parse() {
        System.out.println("Parsing order ...");
        return "Order message";
    }
}

class ResponseParser implements Parser {

    @Override
    public String parse() {
        System.out.println("Parsing response ...");
        return "Response message";
    }
}
