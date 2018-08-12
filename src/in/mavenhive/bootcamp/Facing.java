package in.mavenhive.bootcamp;

// Understands the direction of the rover.
enum Facing {
    NORTH(0, 1) {
        Facing toLeft() { return WEST; }
        Facing toRight() { return EAST; }
    },
    EAST(1, 0) {
        Facing toLeft() { return NORTH; }
        Facing toRight() { return SOUTH; }
    },
    SOUTH(0, -1) {
        Facing toLeft() { return EAST; }
        Facing toRight() { return WEST; }
    },
    WEST(-1, 0) {
        Facing toLeft() { return SOUTH; }
        Facing toRight() { return NORTH; }
    };

    private final int advanceFactorForXAxis;
    private final int advanceFactorForYAxis;
    abstract Facing toLeft();
    abstract Facing toRight();

    Facing(int advanceFactorForXAxis, int advanceFactorForYAxis) {
        this.advanceFactorForXAxis = advanceFactorForXAxis;
        this.advanceFactorForYAxis = advanceFactorForYAxis;
    }

    public AtPosition newPosition(int xCoordinate, int yCoordinate) {
        return new AtPosition(xCoordinate + advanceFactorForXAxis,
                              yCoordinate + advanceFactorForYAxis);
    }
}
