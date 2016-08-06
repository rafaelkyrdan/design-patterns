package creational.patterns.prototype;

/**
 * The interface extends the Cloneable interface and contains a method clone.
 * This interface is implemented by classes which want to create a creational.patterns.prototype object.
 */

public interface Prototype extends Cloneable {
    public AccessControl clone() throws CloneNotSupportedException;
}
