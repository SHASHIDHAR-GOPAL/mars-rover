package in.mavenhive.bootcamp;

// Understands the direction of the rover.
enum Facing {
    NORTH(0, 1),
    EAST(1, 0),
    SOUTH(0, -1),
    WEST(-1, 0);

    private final int advanceFactorForXAxis;
    private final int advanceFactorForYAxis;
    private Facing toLeft;
    private Facing toRight;

    static {
        NORTH.toLeft = WEST;
        SOUTH.toLeft = EAST;
        EAST.toRight = SOUTH;
        WEST.toRight = NORTH;

        WEST.toLeft = SOUTH;
        EAST.toLeft = NORTH;
        NORTH.toRight = EAST;
        SOUTH.toRight = WEST;
    }

    Facing(int advanceFactorForXAxis, int advanceFactorForYAxis) {
        this.advanceFactorForXAxis = advanceFactorForXAxis;
        this.advanceFactorForYAxis = advanceFactorForYAxis;
    }

    public Facing toLeft() {
        return toLeft;
    }

    public Facing toRight() {
        return toRight;
    }

    public int advanceFactorForXAxis() {
        return advanceFactorForXAxis;
    }

    public int advanceFactorForYAxis() {
        return advanceFactorForYAxis;
    }
}
