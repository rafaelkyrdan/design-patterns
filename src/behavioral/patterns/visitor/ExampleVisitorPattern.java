package behavioral.patterns.visitor;

/**
 * Check the output of our example and note the
 * main advantage of the Visitor Pattern is that
 * we can add new operations to the objects without
 * changing its classes.
 */

public class ExampleVisitorPattern {

    public static void main(String[] args) {

        System.out.println("Before behavioral.patterns.visitor......... \\n");

        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");

        HtmlTag p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");

        parentTag.addChildTag(p1);

        HtmlTag child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testing html tag library");
        p1.addChildTag(child1);

        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Paragraph 2");
        p1.addChildTag(child1);

        parentTag.generateHtml();

        System.out.println("\\nAfter behavioral.patterns.visitor....... \\n");

        Visitor cssClass = new CssClassVisitor();
        Visitor style = new StyleVisitor();

        parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        parentTag.accept(style);
        parentTag.accept(cssClass);

        p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        p1.accept(style);
        p1.accept(cssClass);

        parentTag.addChildTag(p1);

        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testing html tag library");
        child1.accept(style);
        child1.accept(cssClass);

        p1.addChildTag(child1);

        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Paragraph 2");
        child1.accept(style);
        child1.accept(cssClass);

        p1.addChildTag(child1);

        parentTag.generateHtml();

    }
}
