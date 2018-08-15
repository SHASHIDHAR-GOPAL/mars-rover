package in.mavenhive.bootcamp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @Test
    void expectRoverToNotChangePositionAndFaceNorthGivenNoCommands() {
        Rover roverOne = rover(atOrigin(), Facing.NORTH);
        Rover roverTwo = rover(atOrigin(), Facing.NORTH);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToNotChangePositionAndFaceEastGivenNoCommands() {
        Rover roverOne = rover(atOrigin(), Facing.EAST);
        Rover roverTwo = rover(atOrigin(), Facing.EAST);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToNotChangePositionAndFaceSouthGivenNoCommands() {
        Rover roverOne = rover(atOrigin(), Facing.SOUTH);
        Rover roverTwo = rover(atOrigin(), Facing.SOUTH);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToNotChangePositionAndFaceWestGivenNoCommands() {
        Rover roverOne = rover(atOrigin(), Facing.WEST);
        Rover roverTwo = rover(atOrigin(), Facing.WEST);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToTurnNorthFromEastWhenAskedToTurnLeft() {
        Rover roverOne = rover(atOrigin(), Facing.EAST);
        Rover roverTwo = rover(atOrigin(), Facing.NORTH);
        assertEquals(roverTwo, roverOne.turnLeft());
    }

    @Test
    void expectRoverToTurnSouthFromWestWhenAskedToTurnLeft() {
        Rover roverOne = rover(atOrigin(), Facing.WEST);
        Rover roverTwo = rover(atOrigin(), Facing.SOUTH);
        assertEquals(roverTwo, roverOne.turnLeft());
    }

    @Test
    void expectRoverToTurnWestFromNorthWhenAskedToTurnLeft() {
        Rover roverOne = rover(atOrigin(), Facing.NORTH);
        Rover roverTwo = rover(atOrigin(), Facing.WEST);
        assertEquals(roverTwo, roverOne.turnLeft());
    }

    @Test
    void expectRoverToTurnEastFromNorthWhenAskedToTurnRight() {
        Rover roverOne = rover(atOrigin(), Facing.NORTH);
        Rover roverTwo = rover(atOrigin(), Facing.EAST);
        assertEquals(roverTwo, roverOne.turnRight());
    }

    @Test
    void expectRoverToTurnWestFromSouthWhenAskedToTurnRight() {
        Rover roverOne = rover(atOrigin(), Facing.SOUTH);
        Rover roverTwo = rover(atOrigin(), Facing.WEST);
        assertEquals(roverTwo, roverOne.turnRight());
    }

    @Test
    void expectRoverToAdvanceAlongEast() {
        Rover roverOne = rover(atOrigin(), Facing.EAST);
        Rover roverTwo = rover(atPosition(1, 0), Facing.EAST);
        assertEquals(roverTwo, roverOne.advance());
    }

    @Test
    void expectRoverToAdvanceAlongNorth() {
        Rover roverOne = rover(atOrigin(), Facing.NORTH);
        Rover roverTwo = rover(atPosition(0, 1), Facing.NORTH);
        assertEquals(roverTwo, roverOne.advance());
    }

    private static Rover rover(AtPosition atPosition, Facing north) {
        return new Rover(atPosition, north);
    }

    private static AtPosition atPosition(int xCoOrdinate, int yCoOrdinate) {
        return new AtPosition(xCoOrdinate, yCoOrdinate);
    }

    private static AtPosition atOrigin() {
        return atPosition(0, 0);
    }
}