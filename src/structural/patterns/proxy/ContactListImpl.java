package structural.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * ContactListImpl class - creates a real ContactList object which will return the list of employees of the company.
 * This object we hide behind the structural.patterns.proxy because getting the whole list is expensive operation.
 * The object will be loaded on demand, only when required.
 */

public class ContactListImpl implements ContactList {
    @Override
    public List<Employee> getEmployeeList() {
        return getEmpList();
    }

    private static List<Employee> getEmpList() {
        List<Employee> empList = new ArrayList<Employee>(5);
        empList.add(new Employee("Employee A", "SE"));
        empList.add(new Employee("Employee B", "Manager"));
        empList.add(new Employee("Employee C", "SSE"));
        empList.add(new Employee("Employee D", "SSE"));
        empList.add(new Employee("Employee E", "SE"));
        return empList;
    }
}
