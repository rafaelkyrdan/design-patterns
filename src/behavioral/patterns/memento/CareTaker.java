package behavioral.patterns.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * The Caretaker class used to store and provide the
 * requested behavioral.patterns.memento object.
 * @method `saveMemento` is used to save the behavioral.patterns.memento object,
 * @method `getMemento` is used to return the request behavioral.patterns.memento object
 * @method `clearSavepoints` is used to clear all the save-points
 * and it deletes all the saved behavioral.patterns.memento objects.
 */

public class CareTaker {

    private final Map<String, Memento> savepointStorage = new HashMap<String, Memento>();

    public void saveMemento(Memento memento, String savepointName) {
        System.out.println("Saving behavioral.patterns.state..." + savepointName);
        savepointStorage.put(savepointName, memento);
    }

    public Memento getMemento(String savepointName) {
        System.out.println("Undo at ..." + savepointName);
        return savepointStorage.get(savepointName);
    }

    public void clearSavepoints() {
        System.out.println("Clearing all save points...");
        savepointStorage.clear();
    }
}
