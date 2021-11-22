package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HumanTest {

    @Test

    void createHuman(){
        Human human = new Human("Kis Pisti", 1977);

        assertEquals("Kis Pisti", human.getName());
        assertEquals(1977, human.getYearOfBirth());
    }
    @Test

    void createHumanWithNotValidYearOfBirth () {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("Kis Pisti", 1877) );
        assertEquals("Hibás adatok!", exception.getMessage());

    }

    @Test

    void createHumanWithNotValidName () {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("KisPisti", 1977));
        assertEquals("Hibás adatok!", exception.getMessage());
    }


}
