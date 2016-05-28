package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Platform factory class which controls the creation of the Platform objects.
 * A method `getPlatformInstance` - a static method which has a platformType as its parameter.
 * This platformType is used as the key in the map, it first checks the map whether
 * a platform object having the key is already exists or not.
 * If no object found, the appropriate platform object gets created, it is put into the map
 * and then the method returns the object.
 */

public final class PlatformFactory {

    private static Map<String, Platform> map = new HashMap<>();

    private PlatformFactory() {
        throw new AssertionError("Cannot instantiate the class");
    }

    public static synchronized Platform getPlatformInstance(String platformType) {
        Platform platform = map.get(platformType);
        if (platform == null) {
            switch (platformType) {
                case "C":
                    platform = new CPlatform();
                    break;
                case "CPP":
                    platform = new CPPPlatform();
                    break;
                case "JAVA":
                    platform = new JavaPlatform();
                    break;
                case "RUBY":
                    platform = new RubyPlatform();
                    break;
            }
            map.put(platformType, platform);
        }
        return platform;
    }
}
