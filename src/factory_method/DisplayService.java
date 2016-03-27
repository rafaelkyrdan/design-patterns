package factory_method;

/**
 * Abstract Service Class is defined to show the parsed messages
 * The getParser method is the `factory method` which is implemented by the subclasses to instantiate the parser object
 */
public abstract class DisplayService {

    public void display() {
        Parser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }

    protected abstract Parser getParser();
}

class ErrorDisplayService extends DisplayService {
    @Override
    public Parser getParser() {
        return new ErrorParser();
    }
}

class FeedbackDisplayService extends DisplayService {
    @Override
    public Parser getParser() {
        return new FeedbackParser();
    }
}

class OrderDisplayService extends DisplayService {
    @Override
    public Parser getParser() {
        return new OrderParser();
    }
}

class ResponseDisplayService extends DisplayService {
    @Override
    public Parser getParser() {
        return new ResponseParser();
    }
}
