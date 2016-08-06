package creational.patterns.abstract_factory;


/**
 * 1 Step.
 * Create an interface that will be implemented by all the concrete factories.
 */
public interface AbstractParserFactory {
    Parser getParserInstance(String parserType);
}


/**
 * 2 Step.
 * The two client concrete parser factories are:
 * FBParserFactory - Factory of parsers for facebook messages and comments
 * TWParserFactory - Factory of parsers for tweets and comments
 * Both these factories implement AbstractParserFactory interface
 * and override the getParserInstance method.
 * Method `getParserInstance` returns the specific parser object, according to argument.
 */

class FBParserFactory implements AbstractParserFactory {
    @Override
    public Parser getParserInstance(String parserType) {
        switch (parserType) {
            case "POST":
                return new FBMessageParser();
            case "COMMENT":
                return new FBCommentParser();
        }
        return null;
    }
}

class TWParserFactory implements AbstractParserFactory {
    @Override
    public Parser getParserInstance(String parserType) {
        switch (parserType) {
            case "TWEETS":
                return new TWTweetsParser();
            case "RESPONSE":
                return new TWResponseParser();
        }
        return null;
    }
}
