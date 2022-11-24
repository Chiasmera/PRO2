package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    Validator validator;

    @BeforeEach
    void setUp() {
        validator = new Validator();

    }

    @Test
    void test_validator_canValidateBrackets_true() {

        //Arrange
        String testExpression = "(3+{5{99{*}}[23[{67}67]]})";

        //Act
        boolean testresult = validator.validateBrackets(testExpression);

        //Assert
        assertTrue(testresult);

    }

    @Test
    void test_validator_canValidateBrackets_false() {

        //Arrange
        String testExpression = "(}){";

        //Act
        boolean testresult = validator.validateBrackets(testExpression);

        //Assert
        assertFalse(testresult);

    }
}