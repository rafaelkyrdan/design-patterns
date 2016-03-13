package decorator;

import java.io.InputStream;

/**
 * Decorator pattern - intend to attach additional responsibilities to an object
 */


public class FilterInputStream extends InputStream {

    /**
     * The Decorator object contains a reference to the actual object.
     */
    private InputStream in;

    protected FilterInputStream(InputStream in) {
        this.in = in;
    }

    @Override
    public int read() {

        try {

            /* Add some additional functionality before */

            in.read();

            /* or after forwarding requests to the underlying object */

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }
}
