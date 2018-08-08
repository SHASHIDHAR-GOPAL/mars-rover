package in.mavenhive.bootcamp;

// Understands the direction of the rover.
enum Facing {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    private Facing toLeft;
    private Facing toRight;

    static {
        NORTH.toLeft = WEST;
        EAST.toLeft = NORTH;
        SOUTH.toLeft = EAST;
        WEST.toLeft = SOUTH;

        NORTH.toRight = EAST;
        EAST.toRight = SOUTH;
        SOUTH.toRight = WEST;
        WEST.toRight = NORTH;
    }

    public Facing toLeft() {
        return toLeft;
    }

    public Facing toRight() {
        return toRight;
    }
}
