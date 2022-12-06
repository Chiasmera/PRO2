package snackssupply;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import snacks.Limb;

import static org.junit.jupiter.api.Assertions.*;

class SnackFactoryTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getNewSnacks() {

        //Assign
        SnackFactory factory = new SnackFactory();
        Limb[] limbcontainer = new Limb[5];

        //Act
        factory.getNewSnacks(limbcontainer);

        //Assert
        for (Limb l : limbcontainer) {
            assertNotEquals(null, l);
        }

        for (Limb l : limbcontainer) {
            System.out.println(l);
        }


    }
}