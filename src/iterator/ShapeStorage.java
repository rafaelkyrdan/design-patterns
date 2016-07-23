package iterator;

/**
 * Class is used to store the Shape objects.
 * For simplicity we have initialized that array up to 5.
 *
 * @method `addShape` is used to add a Shape object to the array and increment the index by one.
 * @method `getShapes` returns the array of Shape type.
 */

public class ShapeStorage {

    private Shape[] shapes = new Shape[5];
    private int index;

    public void addShape(String name) {
        int i = index++;
        shapes[i] = new Shape(i, name);
    }

    public Shape[] getShapes() {
        return shapes;
    }
}
