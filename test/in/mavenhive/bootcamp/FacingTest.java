package in.mavenhive.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacingTest {

    @Test
    void expectLeftOfNorthToBeWest() {
        assertEquals(Facing.WEST, Facing.NORTH.toLeft());
    }

    @Test
    void expectLeftOfSouthToBeEast() {
        assertEquals(Facing.EAST, Facing.SOUTH.toLeft());
    }

    @Test
    void expectRightOfWestToBeNorth() {
        assertEquals(Facing.NORTH, Facing.WEST.toRight());
    }

    @Test
    void expectRightOfEastToBeSouth() {
        assertEquals(Facing.SOUTH, Facing.EAST.toRight());
    }
}