package composite;

import java.util.List;

/**
 * The Composite Pattern in Java can be implemented using the Component class as an abstract class or an interface.
 * In this example, we use an abstract class which defines all the  methods used in a composite class and a leaf class.
 * Some methods are kept abstract in the component class, to enforce its children have specific implementation.
 */

public abstract class HtmlComponent {

    public abstract String getTagName();

    public abstract void setStartTag(String tag);

    public abstract void setEndTag(String tag);

    public void setContent(String body) {
        throw new UnsupportedOperationException("Current operation is not support - for this object");
    }

    public void addChild(HtmlComponent node) {
        throw new UnsupportedOperationException("Current operation is not support - for this object");
    }

    public void removeChild(HtmlComponent node) {
        throw new UnsupportedOperationException("Current operation is not support - for this object");
    }

    public List<HtmlComponent> getChildren() {
        throw new UnsupportedOperationException("Current operation is not support - for this object");
    }

    public abstract void generateHtml();
}
