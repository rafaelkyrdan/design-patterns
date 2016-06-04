package prototype;

/**
 * The AccessControl class implements the Prototype interface and overrides the clone method.
 * The method calls the clone method of the super class and returns the object after down-casting
 * it to the AccessControl type.
 *
 * @property `controlLevel` is used to specific the level of control
 * this object contains. For example, USER, ADMIN, MANAGER etc.
 * @property `access` contains the access right for the user.
 */

public class AccessControl implements Prototype {

    private final String controlLevel;
    private String access;

    public AccessControl(String controlLevel, String access) {
        this.controlLevel = controlLevel;
        this.access = access;
    }

    @Override
    public AccessControl clone() {

        try {
            return (AccessControl) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getControlLevel() {
        return controlLevel;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
