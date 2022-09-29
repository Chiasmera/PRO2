package Opgave3;

public class AnvendPersonAdministrator {
    public static void main(String[] args) {
        System.out.println("Instantier en administrator.");
        PersonAdministrator administrator = PersonAdministrator.getInstance();
        System.out.println("Counterens ID er: "+administrator);
        System.out.println();

        System.out.println("Lav tre personer og tilføj til administratorens liste");
        Person p1 = new Person("Hans");
        Person p2 = new Person("Grethe");
        Person p3 = new Person("Julemanden");
        administrator.addPerson(p1);
        administrator.addPerson(p2);
        administrator.addPerson(p3);
        System.out.println("Administratorens liste:");
        System.out.println(administrator.getPersons());
        System.out.println();

        System.out.println("Instantier en ny administrator.");
        administrator = PersonAdministrator.getInstance();
        System.out.println("Counterens ID er: "+administrator);
        System.out.println("(Den samme)");
        System.out.println();

        System.out.println("tjek at listen stadig er den samme");
        System.out.println(administrator.getPersons());
        System.out.println();


    }

}
