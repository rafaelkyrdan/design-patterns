package structural.patterns.flyweight;

/**
 * The above class implements the Platform interface and provides an implementation
 * for the execute method, to execute the code in Java.
 */

public class JavaPlatform implements Platform {

    public JavaPlatform() {
        System.out.println("JavaPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Java code.");
    }
}
