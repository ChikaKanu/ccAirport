public enum PlaneType {
    AIRBUSA220(170),
    AIRBUSA330(220),
    AIRBUSA320(230),
    AIRBUSA380(300),
    BOING767(400),
    BOING747(320),
    BOING737(270),
    BOING777(600);

    private final int value;

    PlaneType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
