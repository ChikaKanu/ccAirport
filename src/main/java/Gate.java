public enum Gate {

    GATE1(1),
    GATE2(2),
    GATE3(3),
    GATE4(4),
    GATE5(5),
    GATE6(6),
    GATE7(7),
    GATE8(8),
    GATE9(9),
    GATE10(10);

    private final int value;

    Gate(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
