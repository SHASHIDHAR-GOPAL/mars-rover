package in.mavenhive.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @Test
    void expectRoverToNotChangePositionAndFaceNorthGivenNoCommands() {
        Rover roverOne = new Rover(new AtPosition(0, 0), Facing.NORTH);
        Rover roverTwo = new Rover(new AtPosition(0, 0), Facing.NORTH);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToNotChangePositionAndFaceEastGivenNoCommands() {
        Rover roverOne = new Rover(new AtPosition(0, 0), Facing.EAST);
        Rover roverTwo = new Rover(new AtPosition(0, 0), Facing.EAST);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToNotChangePositionAndFaceSouthGivenNoCommands() {
        Rover roverOne = new Rover(new AtPosition(5, 0), Facing.SOUTH);
        Rover roverTwo = new Rover(new AtPosition(5, 0), Facing.SOUTH);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToNotChangePositionAndFaceWestGivenNoCommands() {
        Rover roverOne = new Rover(new AtPosition(2, 3), Facing.WEST);
        Rover roverTwo = new Rover(new AtPosition(2, 3), Facing.WEST);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToTurnNorthFromEastWhenAskedToTurnLeft() {
        Rover roverOne = new Rover(new AtPosition(2, 2), Facing.EAST);
        Rover roverTwo = new Rover(new AtPosition(2, 2), Facing.NORTH);
        assertEquals(roverTwo, roverOne.turnLeft());
    }

    @Test
    void expectRoverToTurnSouthFromWestWhenAskedToTurnLeft() {
        Rover roverOne = new Rover(new AtPosition(5, 5), Facing.WEST);
        Rover roverTwo = new Rover(new AtPosition(5, 5), Facing.SOUTH);
        assertEquals(roverTwo, roverOne.turnLeft());
    }

    @Test
    void expectRoverToTurnWestFromNorthWhenAskedToTurnLeft() {
        Rover roverOne = new Rover(new AtPosition(3,4), Facing.NORTH);
        Rover roverTwo = new Rover(new AtPosition(3,4), Facing.WEST);
        assertEquals(roverTwo, roverOne.turnLeft());
    }

    @Test
    void expectRoverToTurnEastFromNorthWhenAskedToTurnRight() {
        Rover roverOne = new Rover(new AtPosition(2,2), Facing.NORTH);
        Rover roverTwo = new Rover(new AtPosition(2,2), Facing.EAST);
        assertEquals(roverTwo, roverOne.turnRight());
    }

    @Test
    void expectRoverToTurnWesttFromSouthWhenAskedToTurnRight() {
        Rover roverOne = new Rover(new AtPosition(2,2), Facing.SOUTH);
        Rover roverTwo = new Rover(new AtPosition(2,2), Facing.WEST);
        assertEquals(roverTwo, roverOne.turnRight());
    }

    @Test
    void expectRoverToAdvanceAlongEast() {
        Rover roverOne = new Rover(new AtPosition(0,0), Facing.EAST);
        Rover roverTwo = new Rover(new AtPosition(1,0), Facing.EAST);
        assertEquals(roverTwo, roverOne.advance());
    }

    @Test
    void expectRoverToAdvanceAlongNorth() {
        Rover roverOne = new Rover(new AtPosition(0,0), Facing.NORTH);
        Rover roverTwo = new Rover(new AtPosition(0,1), Facing.NORTH);
        assertEquals(roverTwo, roverOne.advance());
    }
}