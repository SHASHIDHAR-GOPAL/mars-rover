package in.mavenhive.bootcamp;

// Understands the location of the rover on a two dimensional plane.
class AtPosition {
    private final int xCoOrdinate;
    private final int yCoOrdinate;

    AtPosition(int xCoOrdinate, int yCoOrdinate) {
        this.xCoOrdinate = xCoOrdinate;
        this.yCoOrdinate = yCoOrdinate;
    }

    AtPosition move(Facing direction) {
        switch (direction){
            case NORTH: return new AtPosition(xCoOrdinate, yCoOrdinate + 1);
            case EAST: return new AtPosition(xCoOrdinate + 1, yCoOrdinate);
            case SOUTH: return new AtPosition(xCoOrdinate, yCoOrdinate - 1);
            case WEST: return new AtPosition(xCoOrdinate - 1, yCoOrdinate);
            default: return this;
        }
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
