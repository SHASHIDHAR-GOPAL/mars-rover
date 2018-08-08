package in.mavenhive.bootcamp;

import java.util.Objects;

class Rover {

    private final AtPosition position;
    private final Facing direction;

    Rover(AtPosition position, Facing direction) {
        this.position = position;
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return Objects.equals(position, rover.position) &&
                direction == rover.direction;
    }

}
