package structural.patterns.proxy;

import java.util.List;

/**
 * The ContactListProxyImpl is the structural.patterns.proxy class which also implements ContactList and holds a reference to the real ContactList object.
 */

public class ContactListProxyImpl implements ContactList {
    private ContactList contactList;

    @Override
    public List<Employee> getEmployeeList() {
        if (contactList == null) {
            System.out.println("Creating contact list and fetching list of - employees...");
            contactList = new ContactListImpl();
        }
        return contactList.getEmployeeList();
    }
}
