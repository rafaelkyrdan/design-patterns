package creational.patterns.singelton;

/**
 * Static field
 * + simple
 * + thread safety
 * - not a lazy
 */

class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();
}

/**
 * Enum Singleton
 * According to Joshua Bloch'a is the best way to implement a behavioral.patterns.template
 * + serializable
 * + thread safety
 * - not a lazy
 */

enum Singleton2 {
    INSTANCE;
}


/**
 * Synchronized Accessor
 * + lazy
 * - low efficiency
 */

class Singleton3 {
    private static Singleton3 instance;

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}

/**
 * Double Checked Locking & volatile
 * + lazy
 * + high performance
 */

class Singleton4 {
    private static volatile Singleton4 instance;

    public static Singleton4 getInstance() {
        Singleton4 localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton4.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton4();
                }
            }
        }
        return localInstance;
    }
}


/**
 * On Demand Holder idiom
 * + lazy
 * + high performance
 * - can't be use for non static fields
 */


class Singleton5 {

    public static class SingletonHolder {
        public static final Singleton5 HOLDER_INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}