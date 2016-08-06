package structural.patterns.flyweight;

/**
 * The above class implements the Platform interface and provides an implementation
 * for the execute method, to execute the code in Ruby.
 */

public class RubyPlatform implements Platform {

    public RubyPlatform() {
        System.out.println("RubyPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Ruby code.");
    }
}
