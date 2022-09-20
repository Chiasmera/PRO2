import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BiblioteksBødeTest {

    BiblioteksBøde bøde;
    LocalDate beregnetDato;

    @BeforeEach
    void setUp () {
        bøde = new BiblioteksBøde();
        beregnetDato = LocalDate.of(2000, 12, 1);
    }

    @Test
    void TC1_beregnBøde() {

        //Arrange
        boolean voksen = true;
        LocalDate faktiskDato = LocalDate.of(2000, 12, 2);

        //Act
        int bødePris = bøde.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        assertEquals(20, bødePris);
    }

    @Test
    void TC2_beregnBøde() {

        //Arrange
        boolean voksen = true;
        LocalDate faktiskDato = LocalDate.of(2000, 12, 6);

        //Act
        int bødePris = bøde.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        assertEquals(20, bødePris);
    }

    @Test
    void TC3_beregnBøde() {

        //Arrange
        boolean voksen = true;
        LocalDate faktiskDato = LocalDate.of(2000, 12, 9);

        //Act
        int bødePris = bøde.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        assertEquals(60, bødePris);
    }

    @Test
    void TC4_beregnBøde() {

        //Arrange
        boolean voksen = true;
        LocalDate faktiskDato = LocalDate.of(2000, 12, 12);

        //Act
        int bødePris = bøde.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        assertEquals(60, bødePris);
    }

    @Test
    void TC5_beregnBøde() {

        //Arrange
        boolean voksen = true;
        LocalDate faktiskDato = LocalDate.of(2000, 12, 16);

        //Act
        int bødePris = bøde.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        assertEquals(90, bødePris);
    }

    @Test
    void TC6_beregnBøde() {

        //Arrange
        boolean voksen = true;
        LocalDate faktiskDato = LocalDate.of(2000, 12, 20);

        //Act
        int bødePris = bøde.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        assertEquals(90, bødePris);
    }

    @Test
    void TC7_beregnBøde() {

        //Arrange
        boolean voksen = false;
        LocalDate faktiskDato = LocalDate.of(2000, 12, 6);

        //Act
        int bødePris = bøde.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        assertEquals(10, bødePris);
    }

    @Test
    void TC8_beregnBøde() {

        //Arrange
        boolean voksen = false;
        LocalDate faktiskDato = LocalDate.of(2000, 12, 12);

        //Act
        int bødePris = bøde.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        assertEquals(30, bødePris);
    }

    @Test
    void TC9_beregnBøde() {

        //Arrange
        boolean voksen = false;
        LocalDate faktiskDato = LocalDate.of(2000, 12, 20);

        //Act
        int bødePris = bøde.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        assertEquals(45, bødePris);
    }
}