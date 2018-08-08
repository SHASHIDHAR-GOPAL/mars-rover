package in.mavenhive.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @Test
    void expectRoverToNotChangePositionAndFaceNorthGivenNoCommands() {
        Rover roverOne = new Rover(new AtPosition(0,0), Facing.NORTH);
        Rover roverTwo = new Rover(new AtPosition(0,0), Facing.NORTH);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToNotChangePositionAndFaceEastGivenNoCommands() {
        Rover roverOne = new Rover(new AtPosition(0,0), Facing.EAST);
        Rover roverTwo = new Rover(new AtPosition(0,0), Facing.EAST);
        assertEquals(roverOne, roverTwo);
    }

    @Test
    void expectRoverToNotChangePositionAndFaceSouthGivenNoCommands() {
        Rover roverOne = new Rover(new AtPosition(5,0), Facing.SOUTH);
        Rover roverTwo = new Rover(new AtPosition(5,0), Facing.SOUTH);
        assertEquals(roverOne, roverTwo);
    }@Test
    void expectRoverToNotChangePositionAndFaceWestGivenNoCommands() {
        Rover roverOne = new Rover(new AtPosition(2,3), Facing.WEST);
        Rover roverTwo = new Rover(new AtPosition(2,3), Facing.WEST);
        assertEquals(roverOne, roverTwo);
    }


}