package behavioral.patterns.visitor;

/**
 * This interface will be implemented by all the classes
 * that need to allow visitors to visit them.
 */

public interface Element {
    public void accept(Visitor visitor);
}
