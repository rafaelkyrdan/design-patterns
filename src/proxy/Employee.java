package proxy;

/**
 * Employee class represents an object which is stored in the collection
 */

public class Employee {
    private String employeeName;
    private String employeeDesignation;

    public Employee(String employeeName, String employeeDesignation) {
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                '}';
    }
}
