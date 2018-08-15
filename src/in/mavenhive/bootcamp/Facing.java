package in.mavenhive.bootcamp;

// Understands the direction of the rover.
enum Facing {
    NORTH(0, 1) {
        Facing toLeft() { return WEST; }
        Facing toRight() { return EAST; }
        Facing toHalfLeft() { return NORTH_WEST; }
        Facing toHalfRight() { return NORTH_EAST; }
    },
    EAST(1, 0) {
        Facing toLeft() { return NORTH; }
        Facing toRight() { return SOUTH; }
        Facing toHalfLeft() { return NORTH_EAST; }
        Facing toHalfRight() { return SOUTH_EAST; }
    },
    SOUTH(0, -1) {
        Facing toLeft() { return EAST; }
        Facing toRight() { return WEST; }
        Facing toHalfLeft() {return SOUTH_EAST; }
        Facing toHalfRight() { return SOUTH_WEST; }
    },
    WEST(-1, 0) {
        Facing toLeft() { return SOUTH; }
        Facing toRight() { return NORTH; }
        Facing toHalfLeft() {return SOUTH_WEST; }
        Facing toHalfRight() { return NORTH_WEST; }
    },
    NORTH_EAST(1, 1) {
        Facing toLeft() { return NORTH_WEST; }
        Facing toRight() { return SOUTH_EAST; }
        Facing toHalfLeft() { return NORTH; }
        Facing toHalfRight() { return EAST; }
    },
    NORTH_WEST(-1, 1) {
        Facing toLeft() { return SOUTH_WEST; }
        Facing toRight() { return NORTH_EAST; }
        Facing toHalfLeft() { return WEST; }
        Facing toHalfRight() { return NORTH; }
    },
    SOUTH_EAST(1, -1) {
        Facing toLeft() { return NORTH_EAST; }
        Facing toRight() { return SOUTH_WEST; }
        Facing toHalfLeft() { return EAST; }
        Facing toHalfRight() { return SOUTH; }
    },
    SOUTH_WEST(-1, -1) {
        Facing toLeft() { return SOUTH_EAST; }
        Facing toRight() { return NORTH_WEST; }
        Facing toHalfLeft() { return SOUTH; }
        Facing toHalfRight() { return WEST; }
    };

    private final int advanceFactorForXAxis;
    private final int advanceFactorForYAxis;
    abstract Facing toLeft();
    abstract Facing toRight();
    abstract Facing toHalfLeft();
    abstract Facing toHalfRight();

    Facing(int advanceFactorForXAxis, int advanceFactorForYAxis) {
        this.advanceFactorForXAxis = advanceFactorForXAxis;
        this.advanceFactorForYAxis = advanceFactorForYAxis;
    }

    public AtPosition newPosition(int xCoordinate, int yCoordinate) {
        return new AtPosition(xCoordinate + advanceFactorForXAxis,
                              yCoordinate + advanceFactorForYAxis);
    }

}
