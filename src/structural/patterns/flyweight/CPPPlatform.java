package structural.patterns.flyweight;

/**
 * The above class implements the Platform interface and provides an implementation
 * for the execute method, to execute the code in CPP.
 */

public class CPPPlatform implements Platform {

    public CPPPlatform() {
        System.out.println("CPPPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing CPP code.");
    }
}
