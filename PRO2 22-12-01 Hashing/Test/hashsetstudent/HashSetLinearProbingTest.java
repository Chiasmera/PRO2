package hashsetstudent;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class HashSetLinearProbingTest {
    HashSetLinearProbing hashSet;
    String obj1;
    String obj2;
    String obj3;
    String obj4;
    String obj5;
    String obj6;
    String obj7;
    String obj8;

    @BeforeEach
    void setUp() {
        hashSet = new HashSetLinearProbing(7);
         obj1 = "Alpha";
         obj2 = "Beta";
         obj3 = "Gamma";
         obj4 = "Delta";
         obj5 = "Epsilon";
         obj6 = "Zeta";
         obj7 = "Eta";
         obj8 = "Theta";



    }

    @Test
    void contains() {
    }

    @Test
    void add_And_Contains() {

        //Act & Assert
        hashSet.add(obj1);
        assertTrue(hashSet.contains(obj1));

        hashSet.add(obj2);
        assertTrue(hashSet.contains(obj2));

        hashSet.add(obj3);
        assertTrue(hashSet.contains(obj3));

        hashSet.add(obj4);
        assertTrue(hashSet.contains(obj4));

        hashSet.add(obj5);
        assertTrue(hashSet.contains(obj5));

        hashSet.add(obj6);
        assertTrue(hashSet.contains(obj6));

        hashSet.add(obj7);
        assertTrue(hashSet.contains(obj7));


    }

    @Test
    void add_Existing() {

        //Arrange
        hashSet.add(obj1);
        hashSet.add(obj2);
        hashSet.add(obj3);

        //Act
        boolean result = hashSet.add(obj2);


        // Assert
        assertFalse(result);
    }

    @Test
    void add_ToFullArray() {

        //Arrange
        hashSet.add(obj1);
        hashSet.add(obj2);
        hashSet.add(obj3);
        hashSet.add(obj4);
        hashSet.add(obj5);
        hashSet.add(obj6);
        hashSet.add(obj7);



        //Act && assert
        assertThrows(RuntimeException.class, () -> hashSet.add(obj8));

        // Assert
        assertFalse(hashSet.contains(obj8));
    }

    @Test
    void remove() {

        //Arrange
        hashSet.add(obj1);
        hashSet.add(obj2);
        hashSet.add(obj3);
        hashSet.add(obj4);
        hashSet.add(obj5);
        hashSet.add(obj6);
        hashSet.add(obj7);

        //Act
        boolean result1 = hashSet.remove(obj1);
        boolean result2 = hashSet.remove(obj5);

        // Assert
        assertTrue(result1);
        assertFalse(hashSet.contains(obj1));

        assertTrue(result2);
        assertFalse(hashSet.contains(obj5));

        assertFalse(hashSet.remove(obj1));
        assertFalse(hashSet.remove(obj5));

        assertTrue(hashSet.contains(obj2));
        assertTrue(hashSet.contains(obj3));
        assertTrue(hashSet.contains(obj4));
        assertTrue(hashSet.contains(obj6));
        assertTrue(hashSet.contains(obj7));
    }
}