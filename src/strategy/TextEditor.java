package strategy;

/**
 * TextEditor class which holds a reference to the TextFormatter interface.
 * The class contains the publishText method which forwards the text to the
 * formatter in order to publish the text in desired format.
 */

public class TextEditor {
    private final TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publishText(String text) {
        textFormatter.format(text);
    }
}
