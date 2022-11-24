package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDropOutStackTest {
    private StackI stack;

    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;
    private Card card5;
    private Card card6;

    @BeforeEach
    void setUp() {
        stack = new ArrayDropOutStack(5);

        this.card1 = new Card("Spade", "Jack");
        this.card2 = new Card("Club", "2");
        this.card3 = new Card("Heart", "3");
        this.card4 = new Card("Heart", "4");
        this.card5 = new Card("Diamond", "5");
        this.card6 = new Card("Diamond", "6");

    }

    @Test
    void dropout_whenPushed() {

        //Arrange
        stack.push(card1);
        stack.push(card2);
        stack.push(card3);
        stack.push(card4);
        stack.push(card5);

                //Act
        stack.push(card6);

        //Assert
        Card cardPopped = (Card) stack.pop();
        assertEquals(card6, cardPopped);

        cardPopped = (Card) stack.pop();
        assertEquals(card5, cardPopped);

        cardPopped = (Card) stack.pop();
        assertEquals(card4, cardPopped);

        cardPopped = (Card) stack.pop();
        assertEquals(card3, cardPopped);

        cardPopped = (Card) stack.pop();
        assertEquals(card2, cardPopped);

        assertThrows(NoSuchElementException.class, () -> {
            stack.pop();
        });

    }

    class Card
    {
        public String symbol;
        public String ranking;

        public Card(String symbol, String ranking)
        {
            super();
            this.symbol = symbol;
            this.ranking = ranking;
        }

        @Override
        public String toString()
        {
            return this.symbol + ": " + this.ranking;
        }
    }
}