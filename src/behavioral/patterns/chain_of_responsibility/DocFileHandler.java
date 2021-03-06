package behavioral.patterns.chain_of_responsibility;

/**
 * Handler for docs files.
 * It holds a reference to the next handler in the chain.
 */
public class DocFileHandler implements Handler {
    private Handler handler;
    private String handlerName;

    public DocFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equals("doc")) {
            System.out.println("Process and saving doc file... by " + handlerName);
        } else if (handler != null) {
            System.out.println(handlerName + " forwards request to " + handler.getHandlerName());
            handler.process(file);
        } else {
            //There are no handlers in the chain so we need to throw an exception.
            System.out.println("File not supported");
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
