package behavioral.patterns.strategy;

/**
 * Concrete text formatter.
 * Concrete behavioral.patterns.strategy.
 */

public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println("[CapTextFormatter]: " + text.toUpperCase());
    }
}
