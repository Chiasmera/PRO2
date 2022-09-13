package ex1student;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {


	public static void main(String[] args) {
		List<Person> list = List.of(
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));
		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();

		//Opgave 1.A - Find første med alder 44
		System.out.println("Person på alder 44");
		Predicate<Person> alder44 = (p) -> p.getAge() == 44;
		System.out.println(findFirst(persons, alder44));
		System.out.println();

		//Opgave 1.B - Find første som starter med S
		System.out.println("Person som starter med S");
		Predicate<Person> starterMedS = (p) -> p.getName().startsWith("S");
		System.out.println(findFirst(persons, starterMedS));
		System.out.println();

		//Opgave 1.C - Find første med mere end 1 i
		System.out.println("Person som indeholder mere end 1 i");
		Predicate<Person> flereI = (p) -> {
			int count = 0;
			for (int i = 0; i<p.getName().length(); i++) {
				if (p.getName().substring(i).startsWith("i")) {
					count++;
				}
			}
			if (count >= 2) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(findFirst(persons, flereI));
		System.out.println();

		//Opgave 1.D - Find person med alder lig med navnelængde
		System.out.println("Person med alder = længde på navn");
		Predicate<Person> alderLigLængde = (p) -> p.getName().length() == p.getAge();
		System.out.println(findFirst(persons, alderLigLængde));
		System.out.println();

		//Opgave 1.E - skriv findAll metode
		System.out.println("tjek om findAll virker");
		List<Person> under30 = findAll(persons, p -> p.getAge() < 30);
		System.out.println(under30);
		System.out.println();

		//Opgave 1.F - find alle som har mere end 1 i
		System.out.println("Find alle med flere i'er");
		List<Person> listFlereI = findAll(persons, p -> (p.getName().indexOf("i") != p.getName().lastIndexOf("i")) && p.getName().indexOf("i") > 0);
		System.out.println(listFlereI);
		System.out.println();

		//Opgave 1.G - find alle som starter med S
		System.out.println("find alle som starter med S");
		List<Person> startS = findAll(persons, p -> p.getName().startsWith("S"));
		System.out.println(startS);
		System.out.println();

		//Opgave 1.H - find alle med navnelængde 5
		System.out.println("find alle med navn på 5 længde");
		List<Person> længde5 = findAll(persons, p -> p.getName().length() == 5);
		System.out.println(længde5);
		System.out.println();

		//Opgave 1.I - find alle med navnelængde >6 og alder<40
		System.out.println("find alle under 40 med navn længere end 6");
		List<Person> længdeOgAlder = findAll(persons, p -> p.getName().length()>6 && p.getAge()<40);
		System.out.println(længdeOgAlder);
		System.out.println();
	}

	/**
	 * Returns from the list the first person
	 * that satisfies the predicate.
	 * Returns null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}

	public static ArrayList<Person> findAll(List<Person> list, Predicate<Person> filter) {
		ArrayList<Person> foundPersons = new ArrayList<>();
		for (Person p : list) {
			if (filter.test(p))
				foundPersons.add(p);
		}
		if (foundPersons.size() > 0) {
			return foundPersons;
		} else {
			return null;
		}
	}
}
