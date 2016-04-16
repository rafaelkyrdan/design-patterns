package chain_of_responsibility;

/**
 * Interface for handlers
 * The setHandler method is used to set the next handler in the chain;
 * The process method is used to process the request, only if the handler can able process the request.
 */

public interface Handler {
    public void setHandler(Handler handler);

    public void process(File file);

    public String getHandlerName();
}