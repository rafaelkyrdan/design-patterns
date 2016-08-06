package behavioral.patterns.chain_of_responsibility;

/**
 * Example of how to use the pattern chain of responsibility
 */

public class ExampleChainOfResponsibility {
    public static void main(String[] args) {
        File file = null;
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");

        //set up the chain in order which we need according to our business logic.
        //last one doesn't have a reference to the next handler
        textHandler.setHandler(docHandler);
        docHandler.setHandler(imageHandler);

        //so now we can use we start the flow from first handler in the chain
        //we don't have a handler for last file
        file = new File("Abc.png", "image", "./../some/path");
        textHandler.process(file);
        System.out.println("\n");
        file = new File("Abc.txt", "text", "./../some/path");
        textHandler.process(file);
        System.out.println("\n");
        file = new File("Abc.doc", "doc", "./../some/path");
        textHandler.process(file);
        System.out.println("\n");
        file = new File("Abc.bat", "bat", "./../some/path");
        textHandler.process(file);

    }
}
