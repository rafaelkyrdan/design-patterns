package behavioral.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * The concrete element overrides the accept
 * method of the Element interface and will call the
 * visit method, and will pass this operator as an argument.
 * This will allow the behavioral.patterns.visitor method to get all the public
 * members of the object, to add new operations on it.
 */

public class HtmlParentElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childrenTag;


    public HtmlParentElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
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
    public String getStartTag() {
        return startTag;
    }

    @Override
    public String getEndTag() {
        return endTag;
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return childrenTag;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag);
        for (HtmlTag tag : childrenTag) {
            tag.generateHtml();
        }
        System.out.println(endTag);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
