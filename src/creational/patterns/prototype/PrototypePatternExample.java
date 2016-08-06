package creational.patterns.prototype;

/**
 * This example shows that getAccessControlObject is used to get
 * the new copy of the AccessControl object, and this can be clearly
 * seen when we change the access right for User B, the access right for User A
 * is not changed. This confirms that the clone method is working fine,
 * as it returns the new copy of the object not a reference which points to the same object.
 */

public class PrototypePatternExample {

    public static void main(String[] args) {

        AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        User user = new User("User A", "USER Level", userAccessControl);

        System.out.println(user);
        System.out.println("************************************");

        userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        User userB = new User("User B", "USER Level", userAccessControl);
        System.out.println("Changing access control of: " + userB.getUserName());
        user.getAccessControl().setAccess("READ REPORTS");

        System.out.println(userB);
        System.out.println("user A access level has not been changed = " + user);
        System.out.println("It means that clone method works fine.");
        System.out.println("************************************");

        AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
        user = new User("User C", "MANAGER Level", managerAccessControl);
        System.out.println(user);
    }
}
