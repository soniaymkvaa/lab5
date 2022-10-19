package store;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}