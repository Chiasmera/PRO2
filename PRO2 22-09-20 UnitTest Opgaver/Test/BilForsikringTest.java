import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    private BilForsikring forsikring;

    @BeforeEach
    void setUp () {
        forsikring = new BilForsikring();
        forsikring.setGrundpaemie(2000);
    }

    @Test
    void TC1_beregnPraemie_18_mand_0() {
        //Arrange
        int alder = 18;
        boolean isKvinde = false;
        int skadeFrieAer = 0;

        //Act
        double beregnetpræmie = forsikring.beregnPraemie(alder,isKvinde, skadeFrieAer);

        //Assert
        assertEquals(2500, beregnetpræmie);
    }

    @Test
    void TC2_beregnPraemie_20_mand_0() {
        //Arrange
        int alder = 20;
        boolean isKvinde = false;
        int skadeFrieAer = 0;

        //Act
        double beregnetpræmie = forsikring.beregnPraemie(alder,isKvinde, skadeFrieAer);

        //Assert
        assertEquals(2500, beregnetpræmie);
    }

    @Test
    void TC4_beregnPraemie_25_mand_0() {
        //Arrange
        int alder = 25;
        boolean isKvinde = false;
        int skadeFrieAer = 0;

        //Act
        double beregnetpræmie = forsikring.beregnPraemie(alder,isKvinde, skadeFrieAer);

        //Assert
        assertEquals(2000, beregnetpræmie);
    }

    @Test
    void TC5_beregnPraemie_50_mand_0() {
        //Arrange
        int alder = 50;
        boolean isKvinde = false;
        int skadeFrieAer = 0;

        //Act
        double beregnetpræmie = forsikring.beregnPraemie(alder,isKvinde, skadeFrieAer);

        //Assert
        assertEquals(2000, beregnetpræmie);
    }

    @Test
    void TC7_beregnPraemie_100_mand_0() {
        //Arrange
        int alder = 100;
        boolean isKvinde = false;
        int skadeFrieAer = 0;

        //Act
        double beregnetpræmie = forsikring.beregnPraemie(alder,isKvinde, skadeFrieAer);

        //Assert
        assertEquals(2000, beregnetpræmie);
    }

    @Test
    void TC9_beregnPraemie_50_kvinde_0() {
        //Arrange
        int alder = 50;
        boolean isKvinde = true;
        int skadeFrieAer = 0;

        //Act
        double beregnetpræmie = forsikring.beregnPraemie(alder,isKvinde, skadeFrieAer);

        //Assert
        assertEquals(1900, beregnetpræmie);
    }

    @Test
    void TC14_beregnPraemie_20_mand_3() {
        //Arrange
        int alder = 20;
        boolean isKvinde = false;
        int skadeFrieAer = 3;

        //Act
        double beregnetpræmie = forsikring.beregnPraemie(alder,isKvinde, skadeFrieAer);

        //Assert
        assertEquals(2125, beregnetpræmie);
    }

    @Test
    void TC22_beregnPraemie_20_mand_6() {
        //Arrange
        int alder = 20;
        boolean isKvinde = false;
        int skadeFrieAer = 6;

        //Act
        double beregnetpræmie = forsikring.beregnPraemie(alder,isKvinde, skadeFrieAer);

        //Assert
        assertEquals(1875, beregnetpræmie);
    }

    @Test
    void TC30_beregnPraemie_20_mand_10() {
        //Arrange
        int alder = 20;
        boolean isKvinde = false;
        int skadeFrieAer = 3;

        //Act
        double beregnetpræmie = forsikring.beregnPraemie(alder,isKvinde, skadeFrieAer);

        //Assert
        assertEquals(1625, beregnetpræmie);
    }

    @Test
    void setGrundpaemie() {

        //Arrange
        BilForsikring forsikring = new BilForsikring();
        double inputGrundPraemie = 1000;

        //Act
        forsikring.setGrundpaemie(inputGrundPraemie);

        //Assert
        assertEquals(inputGrundPraemie, forsikring.getGrundPraemie());
    }


}