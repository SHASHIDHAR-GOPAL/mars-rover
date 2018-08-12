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

    @Test
    void expectCorrectPositionGivenMoveAlongSouth() {
        AtPosition positionBeforeMove = new AtPosition(3, 4);
        AtPosition positionAfterMove = new AtPosition(3, 3);
        assertEquals(positionAfterMove, positionBeforeMove.move(Facing.SOUTH));
    }

    @Test
    void expectCorrectPositionGivenMoveAlongEast() {
        AtPosition positionBeforeMove = new AtPosition(7, -3);
        AtPosition positionAfterMove = new AtPosition(8, -3);
        assertEquals(positionAfterMove, positionBeforeMove.move(Facing.EAST));
    }

    @Test
    void expectCorrectPositionGivenMoveAlongWest() {
        AtPosition positionBeforeMove = new AtPosition(-12, -5);
        AtPosition positionAfterMove = new AtPosition(-13, -5);
        assertEquals(positionAfterMove, positionBeforeMove.move(Facing.WEST));
    }
}