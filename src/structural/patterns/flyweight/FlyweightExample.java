package structural.patterns.flyweight;

/**
 * We performed the same procedure, i.e. creating and setting the Code object,
 * and then asking for a platform object, specific to the code.
 * The output clearly shows that the platform objects created only the first time
 * they are requested for; on the next attempts the same object gets returned.
 */

public class FlyweightExample {

    public static void main(String[] args) {

        Code code = new Code();
        code.setCode("C Code...");
        Platform platform = PlatformFactory.getPlatformInstance("C");
        platform.execute(code);
        System.out.println("*************************");
        System.out.println();

        code = new Code();
        code.setCode("C Code2...");
        platform = PlatformFactory.getPlatformInstance("C");
        platform.execute(code);
        System.out.println("*************************");
        System.out.println();

        code = new Code();
        code.setCode("JAVA Code...");
        platform = PlatformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
        System.out.println("*************************");
        System.out.println();

        code = new Code();
        code.setCode("JAVA Code2...");
        platform = PlatformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
        System.out.println("*************************");
        System.out.println();

        code = new Code();
        code.setCode("RUBY Code...");
        platform = PlatformFactory.getPlatformInstance("RUBY");
        platform.execute(code);
        System.out.println("*************************");
        System.out.println();

        code = new Code();
        code.setCode("RUBY Code2...");
        platform = PlatformFactory.getPlatformInstance("RUBY");
        platform.execute(code);
    }
}
