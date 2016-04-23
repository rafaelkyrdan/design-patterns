package proxy;

import java.util.List;

/**
 * First we have created a Company object with a proxy ContactList object.
 * At this time, the Company object holds a proxy reference, not the real ContactList object’s reference,
 * so there no employee list loaded into the memory. We made some calls on the company object, and then asked for the
 * employee list from the contact list proxy object using the getEmployeeList() method.
 * On call of this method, the proxy object creates a real ContactList object and provides the list of employees.
 */

public class ExampleProxy {

    public static void main(String[] args) {

        ContactList contactList = new ContactListProxyImpl();
        Company company = new Company("ABC Company", "India", "+91-011-28458965", contactList);

        System.out.println("Company Name: " + company.getCompanyName());
        System.out.println("Company Address: " + company.getCompanyAddress());
        System.out.println("Company Contact No.: " + company.getCompanyContactNo());

        System.out.println("Requesting for contact list");
        contactList = company.getContactList();
        List<Employee> empList = contactList.getEmployeeList();
        empList.forEach(System.out::println);
    }
}
