package flyweight;

/**
 * The Platform interface is implemented by the language specific platform
 * in order to execute the code.
 * It has one method, executes, which takes the Code object as its parameter.
 */

public interface Platform {
    public void execute(Code code);
}
