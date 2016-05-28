package flyweight;

/**
 * The above class implements the Platform interface and provides an implementation
 * for the execute method, to execute the code in C.
 */

public class CPlatform implements Platform {

    public CPlatform() {
        System.out.println("CPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing C code.");
    }
}
