package behavioral.patterns.strategy;

/**
 * The output clearly shows the different text format produced by the
 * different text editors due to the different text formatter used by it.
 */

public class ExampleStrategyPattern {

    public static void main(String[] args) {
        TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.publishText("Testing text in caps formatter");

        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.publishText("Testing text in lower formatter");
    }
}
