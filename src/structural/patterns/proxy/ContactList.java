package structural.patterns.proxy;

import java.util.List;

/**
 * Interface ContactList
 * This interface implemented by Proxy class and the class which we hide behind the structural.patterns.proxy.
 */

public interface ContactList {
    public List<Employee> getEmployeeList();
}
