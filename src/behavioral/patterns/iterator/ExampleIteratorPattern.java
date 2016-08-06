package behavioral.patterns.iterator;

/**
 * We have created a ShapeStorage object and stores the Shape objects in it.
 * Next, we created a ShapeIterator object and assigned it the shapes.
 * We iterated twice, first without calling the remove method and then with the remove method.
 */

public class ExampleIteratorPattern {

    public static void main(String[] args) {

        ShapeStorage storage = new ShapeStorage();
        storage.addShape("Polygon");
        storage.addShape("Hexagon");
        storage.addShape("Circle");
        storage.addShape("Rectangle");
        storage.addShape("Square");

        ShapeIterator iterator = new ShapeIterator(storage.getShapes());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Apply removing while iterating...");
        iterator = new ShapeIterator(storage.getShapes());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
