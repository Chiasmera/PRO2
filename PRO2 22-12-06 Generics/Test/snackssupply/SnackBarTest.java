package snackssupply;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import snacks.Limb;
import snacks.Pez;
import snacks.Smartie;
import snacks.Snack;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SnackBarTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void sortSnacks() {
        //Arrange
        List<Limb> originalList = new ArrayList<>();
        Limb s1 = new Limb();
        Limb s2 = new Limb();
        Limb s3 = new Limb();
        Limb s4 = new Limb();
        Limb s5 = new Limb();

        originalList.add(s1);
        originalList.add(s2);
        originalList.add(s3);
        originalList.add(s4);
        originalList.add(s5);

        //Act & Assert
        System.out.println(originalList);
        List<Limb> sortedList = SnackBar.sortSnacks(originalList);
        System.out.println();
        System.out.println(sortedList);


    }
}