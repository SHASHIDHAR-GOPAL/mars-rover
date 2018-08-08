package in.mavenhive.bootcamp;

import java.util.Objects;

class AtPosition {
    private final int xCoOrdinate;
    private final int yCoOrdinate;

    AtPosition(int xCoOrdinate, int yCoOrdinate) {

        this.xCoOrdinate = xCoOrdinate;
        this.yCoOrdinate = yCoOrdinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtPosition that = (AtPosition) o;
        return xCoOrdinate == that.xCoOrdinate &&
                yCoOrdinate == that.yCoOrdinate;
    }

}
