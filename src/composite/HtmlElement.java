package composite;

/**
 * The HtmlElement is the leaf class, and its main job is to implement the operation method,
 * which in this example is the generateHtml method.
 */

public class HtmlElement extends HtmlComponent {

    private String tagName;
    private String startTag;
    private String endTag;
    private String content;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
        this.content = "";
        this.startTag = "";
        this.endTag = "";
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
    public void setContent(String body) {
        this.content = body;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag + "" + content + "" + endTag);
    }
}
