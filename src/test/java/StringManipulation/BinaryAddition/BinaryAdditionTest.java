package StringManipulation.BinaryAddition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryAdditionTest {

    @Test
    void addBinary() {
        assertEquals("101",BinaryAddition.addBinary("100","1"));
        assertEquals("100",BinaryAddition.addBinary("11","1"));
        assertEquals("1",BinaryAddition.addBinary("1","0"));
    }

}