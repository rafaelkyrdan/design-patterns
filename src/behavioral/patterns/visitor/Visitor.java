package behavioral.patterns.visitor;

/**
 * This interface contains visit methods with an
 * argument of a class that implements the Element interface.
 */

public interface Visitor {

    public void visit(HtmlElement element);

    public void visit(HtmlParentElement parentElement);
}
