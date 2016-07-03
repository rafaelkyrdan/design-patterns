package strategy;

/**
 * Concrete text formatter.
 * Concrete strategy.
 */

public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("[CapTextFormatter]: " + text.toUpperCase());
    }
}
