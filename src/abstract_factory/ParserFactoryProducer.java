package abstract_factory;

/**
 * 5 Step
 * Implement a factory-producer which has a static method
 * and is responsible to provide a desired factory object to the client object.
 */
public final class ParserFactoryProducer {

    private ParserFactoryProducer() {
        throw new AssertionError();
    }

    public static AbstractParserFactory getFactory(String factoryType) throws NullPointerException{
        switch (factoryType) {
            case "FACEBOOK":
                return new FBParserFactory();
            case "TWITTER":
                return new TWParserFactory();
        }
        return null;
    }

}
