package creational.patterns.abstract_factory;

/**
 * Created by raphaelkyrdan on 3/13/16.
 */
public class ExampleAbstractFactoryPattern {


    public static void main(String[] args) {

        /* Use first factory */

        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("FACEBOOK");
        Parser parser = parserFactory.getParserInstance("POST");
        String msg = parser.parse();
        System.out.println(msg);

        System.out.println();

        /* Use second factory */
        parserFactory = ParserFactoryProducer.getFactory("TWITTER");
        parser = parserFactory.getParserInstance("TWEETS");
        msg = parser.parse();
        System.out.println(msg);

    }
}
