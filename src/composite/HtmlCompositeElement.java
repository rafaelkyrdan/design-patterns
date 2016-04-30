package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * The HtmlCompositeElement class is the `Composite` class which implements methods
 * like addChild, removeChild, getChildren which must be implemented by a class to become the `composite` of the structure.
 */

public class HtmlCompositeElement extends HtmlComponent {

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlComponent> children;

    public HtmlCompositeElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.children = new ArrayList<>();
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void addChild(HtmlComponent node) {
        children.add(node);
    }

    @Override
    public void removeChild(HtmlComponent node) {
        children.remove(node);
    }

    @Override
    public List<HtmlComponent> getChildren() {
        return children;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag);
        for (HtmlComponent node : children) {
            node.generateHtml();
            System.out.println(endTag);
        }
    }
}
