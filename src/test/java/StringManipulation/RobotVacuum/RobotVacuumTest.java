package StringManipulation.RobotVacuum;

import StringManipulation.RobotVacuumReturn.RobotVacuum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RobotVacuumTest {

    @Test
    public void isRobotReturnToOrigin(){
        assertEquals(true, RobotVacuum.isRobotReturnToOrigin("LR"));
        assertEquals(true, RobotVacuum.isRobotReturnToOrigin("RUULLDRD"));
    }

    @Test
    public void isNotRobotReturnToOrigin(){
        assertEquals(false, RobotVacuum.isRobotReturnToOrigin("URURD"));
        assertEquals(false, RobotVacuum.isRobotReturnToOrigin("URURDU"));
    }
}
