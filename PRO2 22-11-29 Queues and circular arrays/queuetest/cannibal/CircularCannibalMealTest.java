package cannibal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Ingen måde at tjekke data på fordi vi mangler metoder til at se listen, så print bliver brugt til tjek :(
 */
class CircularCannibalMealTest {
    CircularCannibalMeal festMaeltid;
    Person person1;
    Person person2;
    Person person3;
    Person person4;
    Person person5;
    Person person6;
    Person person7;
    Person person8;
    Person person9;
    Person person10;

    @BeforeEach
    void setUp() {
        festMaeltid = new CircularCannibalMeal();

        person1 = new Person("Anders", "Afslappet");
        person2 = new Person("Jakob", "Bange");
        person3 = new Person("Niels", "Vred");
         person4 = new Person("Stefan", "Rolig");
         person5 = new Person("Elisabeth", "Beslutsom");
         person6 = new Person("Allice", "Flot");
         person7 = new Person("Rikke", "Sjov");
         person8 = new Person("Mathilde", "Mistænksom");
         person9 = new Person("Julie", "Distraheret");
         person10 = new Person("Anton", "Intelligent");
    }

    @Test
    void addPerson() {

        //Arrange

        //Act & //Assert
        festMaeltid.addPerson(person1);
        festMaeltid.printPersons();

        festMaeltid.addPerson(person2);
        festMaeltid.printPersons();

        festMaeltid.addPerson(person3);
        festMaeltid.printPersons();

        festMaeltid.addPerson(person4);
        festMaeltid.printPersons();

    }

    @Test
    void eatRandomPerson() {

        //Arrange
        festMaeltid.addPerson(person1);
        festMaeltid.addPerson(person10);
        Person eatenPerson;

        //Act & assert
        eatenPerson = festMaeltid.eatRandomPerson();
        System.out.println("Person spist: "+eatenPerson);
        System.out.println("Personer tilbage: ");
        festMaeltid.printPersons();

        eatenPerson = festMaeltid.eatRandomPerson();
        System.out.println("Person spist: "+eatenPerson);
        System.out.println("Personer tilbage: ");
        festMaeltid.printPersons();


    }

    @Test
    void eatNextPerson() {
        //Arrange
        festMaeltid.addPerson(person1);
        festMaeltid.addPerson(person2);
        festMaeltid.addPerson(person3);
        festMaeltid.addPerson(person4);
        festMaeltid.addPerson(person5);
        festMaeltid.addPerson(person6);
        festMaeltid.addPerson(person7);
        festMaeltid.addPerson(person8);
        festMaeltid.addPerson(person9);
        festMaeltid.addPerson(person10);

        //Act & Assert
        System.out.println("Persons at the feast: ");
        festMaeltid.printPersons();
        System.out.println();

        Person eatenPerson = festMaeltid.eatNextPerson(5);
        assertEquals(person5, eatenPerson);

        System.out.println("Person eaten: "+eatenPerson);
        System.out.println("Persons remaining: ");
        festMaeltid.printPersons();

        eatenPerson = festMaeltid.eatNextPerson(1);
        assertEquals(person4, eatenPerson);

        System.out.println("Person eaten: "+eatenPerson);
        System.out.println("Persons remaining: ");
        festMaeltid.printPersons();


    }

    @Test
    void printPerson() {
        festMaeltid.addPerson(person1);
        festMaeltid.addPerson(person2);
        festMaeltid.addPerson(person3);

        festMaeltid.printPersons();
    }


}