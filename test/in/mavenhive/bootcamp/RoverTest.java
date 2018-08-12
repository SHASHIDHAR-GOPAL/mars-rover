package in.mavenhive.bootcamp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @Test
    void expectRoverToNotChangePositionAndFaceNorthGivenNoCommands() {
        Rover roverOne = new Rover(atPosition(0, 0), Facing.NORTH);
        Rover roverTwo = new Rover(atPosition(0, 0), Facing.NORTH);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToNotChangePositionAndFaceEastGivenNoCommands() {
        Rover roverOne = new Rover(atPosition(0, 0), Facing.EAST);
        Rover roverTwo = new Rover(atPosition(0, 0), Facing.EAST);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToNotChangePositionAndFaceSouthGivenNoCommands() {
        Rover roverOne = new Rover(atPosition(0, 0), Facing.SOUTH);
        Rover roverTwo = new Rover(atPosition(0, 0), Facing.SOUTH);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToNotChangePositionAndFaceWestGivenNoCommands() {
        Rover roverOne = new Rover(atPosition(2, 3), Facing.WEST);
        Rover roverTwo = new Rover(atPosition(2, 3), Facing.WEST);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToTurnNorthFromEastWhenAskedToTurnLeft() {
        Rover roverOne = new Rover(atPosition(2, 2), Facing.EAST);
        Rover roverTwo = new Rover(atPosition(2, 2), Facing.NORTH);
        assertEquals(roverTwo, roverOne.turnLeft());
    }

    @Test
    void expectRoverToTurnSouthFromWestWhenAskedToTurnLeft() {
        Rover roverOne = new Rover(atPosition(5, 5), Facing.WEST);
        Rover roverTwo = new Rover(atPosition(5, 5), Facing.SOUTH);
        assertEquals(roverTwo, roverOne.turnLeft());
    }

    @Test
    void expectRoverToTurnWestFromNorthWhenAskedToTurnLeft() {
        Rover roverOne = new Rover(atPosition(3, 4), Facing.NORTH);
        Rover roverTwo = new Rover(atPosition(3, 4), Facing.WEST);
        assertEquals(roverTwo, roverOne.turnLeft());
    }

    @Test
    void expectRoverToTurnEastFromNorthWhenAskedToTurnRight() {
        Rover roverOne = new Rover(atPosition(2, 2), Facing.NORTH);
        Rover roverTwo = new Rover(atPosition(2, 2), Facing.EAST);
        assertEquals(roverTwo, roverOne.turnRight());
    }

    @Test
    void expectRoverToTurnWestFromSouthWhenAskedToTurnRight() {
        Rover roverOne = new Rover(atPosition(2, 2), Facing.SOUTH);
        Rover roverTwo = new Rover(atPosition(2, 2), Facing.WEST);
        assertEquals(roverTwo, roverOne.turnRight());
    }

    @Test
    void expectRoverToAdvanceAlongEast() {
        Rover roverOne = new Rover(atPosition(0, 0), Facing.EAST);
        Rover roverTwo = new Rover(atPosition(1, 0), Facing.EAST);
        assertEquals(roverTwo, roverOne.advance());
    }

    @Test
    void expectRoverToAdvanceAlongNorth() {
        Rover roverOne = new Rover(atPosition(0, 0), Facing.NORTH);
        Rover roverTwo = new Rover(atPosition(0, 1), Facing.NORTH);
        assertEquals(roverTwo, roverOne.advance());
    }

    @Test
    void expectRoverToExecuteGivenCommands() {
        Rover roverOne = new Rover(atPosition(0,0), Facing.NORTH);
        Rover roverTwo = new Rover(atPosition(-2,-1), Facing.SOUTH);
        assertEquals(executeCommands(roverOne), roverTwo);
    }

    private static Rover executeCommands(Rover roverOne) {
        return roverOne.advance().turnRight().turnRight().advance().advance().turnLeft()
                    .turnLeft().turnLeft().advance().advance().turnLeft();
    }

    private static AtPosition atPosition(int xCoOrdinate, int yCoOrdinate) {
        return new AtPosition(xCoOrdinate, yCoOrdinate);
    }
}