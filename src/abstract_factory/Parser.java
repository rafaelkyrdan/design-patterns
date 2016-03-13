package abstract_factory;

/**
 * 3 Step
 * `Parser` interface is implemented by the concrete parser classes to parse
 * the Social Media Object(Message, Post, Tweet, Comment e.g.) and returns the string message.
 */
public interface Parser {
    String parse();
}


/**
 * 4 Step
 * Concrete parsers that are specific to the client.
 */

class FBMessageParser implements Parser {

    @Override
    public String parse() {
        System.out.println("Facebook messages parser");
        return "Facebook message";
    }
}

class FBCommentParser implements Parser {

    @Override
    public String parse() {
        System.out.println("Facebook comment parser");
        return "Facebook comment";
    }
}

class TWTweetsParser implements Parser {

    @Override
    public String parse() {
        System.out.println("Tweets parser");
        return "Tweet message";
    }
}

class TWResponseParser implements Parser {

    @Override
    public String parse() {
        System.out.println("Response parser");
        return "Response message";
    }
}