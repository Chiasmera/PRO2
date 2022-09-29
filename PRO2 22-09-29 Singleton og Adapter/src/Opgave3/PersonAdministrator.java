package Opgave3;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {
    //Fields ---------------------------------------------------------------------------------------------------------
    Set<Person> persons = new HashSet<>();
    //Variabel til at holde det unikke objekt af klassen
    private static PersonAdministrator uniqueAdministrator;

    //Constructors ---------------------------------------------------------------------------------------------------
    private PersonAdministrator () {
    }

    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------
    public void addPerson (Person person) {
        persons.add(person);
    }

    public void removePerson (Person person) {
        persons.remove(person);
    }

    public Set<Person> getPersons() {
        return new HashSet<>(persons);
    }

    public static PersonAdministrator getInstance () {
        if (uniqueAdministrator == null) {
            uniqueAdministrator = new PersonAdministrator();
        }
        return uniqueAdministrator;
    }

    //Methods - Other ------------------------------------------------------------------------------------------------


}
