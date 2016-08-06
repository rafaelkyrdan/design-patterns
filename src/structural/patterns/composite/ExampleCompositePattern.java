package structural.patterns.composite;

/**
 * It is example of `Composite pattern` which shows how we can treat a single object and composition of objects uniformly.
 * This structure represents as a hierarchy and the call to generateHtml()
 * method on the parent tag allows the client to treat the compositions of objects uniformly.
 * It generates the html of the object and of all its children.
 */

public class ExampleCompositePattern {
    public static void main(String[] args) {
        HtmlComponent parentTag = new HtmlCompositeElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        HtmlComponent p1 = new HtmlCompositeElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        parentTag.addChild(p1);
        HtmlComponent child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setContent("Testing html tag library");
        p1.addChild(child1);
        child1 = new HtmlElement("<p>");
        child1.setStartTag("<p>");
        child1.setEndTag("</p>");
        child1.setContent("Paragraph 2");
        p1.addChild(child1);
        parentTag.generateHtml();
    }
}
