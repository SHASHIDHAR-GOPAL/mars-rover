package in.mavenhive.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtPositionTest {

    @Test
    void expectRoverToMoveByOneUnitAlongNorthWithoutChangingDirection() {
        AtPosition positionOne = new AtPosition(2,3);
        AtPosition positionTwo = new AtPosition(2,4);
        assertEquals(positionTwo, positionOne.move(Facing.NORTH));
    }

    @Test
    void expectRoverToMoveByOneUnitAlongWestWithoutChangingDirection() {
        AtPosition positionOne = new AtPosition(5,4);
        AtPosition positionTwo = new AtPosition(4,4);
        assertEquals(positionTwo,positionOne.move(Facing.WEST));
    }
}