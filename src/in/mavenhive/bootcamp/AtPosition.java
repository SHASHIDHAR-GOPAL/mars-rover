package in.mavenhive.bootcamp;

// Understands the location of the rover on a two dimensional plane.
class AtPosition {
    private static final int ADVANCE_FACTOR = 1;
    private final int xCoOrdinate;
    private final int yCoOrdinate;

    AtPosition(int xCoOrdinate, int yCoOrdinate) {
        this.xCoOrdinate = xCoOrdinate;
        this.yCoOrdinate = yCoOrdinate;
    }

    AtPosition move(Facing direction) {
        switch (direction) {
            case NORTH: return newPosition(xCoOrdinate, yCoOrdinate + ADVANCE_FACTOR);
            case EAST: return newPosition(xCoOrdinate + ADVANCE_FACTOR, yCoOrdinate);
            case SOUTH: return newPosition(xCoOrdinate, yCoOrdinate - ADVANCE_FACTOR);
            case WEST: return newPosition(xCoOrdinate - ADVANCE_FACTOR, yCoOrdinate);
            default: return this;
        }
    }

    private static AtPosition newPosition(int xCoOrdinate, int yCoOrdinate) {
        return new AtPosition(xCoOrdinate, yCoOrdinate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtPosition that = (AtPosition) o;
        return xCoOrdinate == that.xCoOrdinate &&
                yCoOrdinate == that.yCoOrdinate;
    }

    @Override
    public String toString() {
        return "AtPosition{" +
                "xCoOrdinate=" + xCoOrdinate +
                ", yCoOrdinate=" + yCoOrdinate +
                '}';
    }
}
