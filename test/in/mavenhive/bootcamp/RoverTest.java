package in.mavenhive.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @Test
    void expectRoverToNotChangePositionOrDirectionGivenNoCommands() {
        Rover roverOne = new Rover(new AtPosition(0,0), Facing.NORTH);
        Rover roverTwo = new Rover(new AtPosition(0,0), Facing.NORTH);
        assertEquals(roverOne, roverTwo);
    }
}