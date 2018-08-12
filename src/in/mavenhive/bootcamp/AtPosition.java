package in.mavenhive.bootcamp;

// Understands the location of the rover on a two dimensional plane.
class AtPosition {
    private final int xCoordinate;
    private final int yCoordinate;

    AtPosition(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    AtPosition move(Facing direction) {
        return direction.newPosition(xCoordinate, yCoordinate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtPosition that = (AtPosition) o;
        return xCoordinate == that.xCoordinate &&
                yCoordinate == that.yCoordinate;
    }

    @Override
    public String toString() {
        return "AtPosition{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}
