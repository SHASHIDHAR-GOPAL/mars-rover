package in.mavenhive.bootcamp;

enum Facing {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    private Facing toLeft;

    static {
        NORTH.toLeft = WEST;
        EAST.toLeft = NORTH;
        SOUTH.toLeft = EAST;
        WEST.toLeft = SOUTH;
    }

    public Facing toLeft() {
        return toLeft;
    }
}
