package animalkingdom;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
    private static List<Animal> filteredAnimals(List<Animal> animals, CheckAnimal tester)
	{
		List<Animal> tempList = new ArrayList<>();
		for (Animal v : animals)
		{
			if (tester.test(v))
			{
				tempList.add(v);
			}
		}
		return tempList;
	}
    public static void main(String[] args) {

        // creating some mammals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // creating some birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // creating some fishies
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // Creating and ArrayList of all of the animals
        List<Animal> animalList = new ArrayList<>();

        // Adding animals to the list
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        animalList.forEach(n -> System.out.println(n));

        System.out.println("\n*** List all the animals in descending order by year named  ***");
        animalList.sort((v1, v2) -> v2.getYearNamed() - v1.getYearNamed());
        animalList.forEach(n -> System.out.println(n));

        System.out.println("\n*** List all the animals alphabetically ***");
        animalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        animalList.forEach(n -> System.out.println(n));

        System.out.println("\n***List all the animals in order by how they move ***");
        animalList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        animalList.forEach(n -> System.out.println(n));


        System.out.println("\n*** List only those animals that breath with lungs ***");
        List<Animal> onlyLungBreathers = filteredAnimals(animalList, v -> v.breathe() == "lungs");
        onlyLungBreathers.forEach(n -> System.out.println(n));

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        List<Animal> onlyLungBreathersNamedIn1758 = filteredAnimals(onlyLungBreathers, v -> v.yearNamed == 1758);
        onlyLungBreathersNamedIn1758.forEach(n -> System.out.println(n));

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        List<Animal> onlyLungBreathersThatLayEggs = filteredAnimals(onlyLungBreathers, v -> v.reproduce() == "eggs");
        onlyLungBreathersThatLayEggs.forEach(n -> System.out.println(n));

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        List<Animal> namedIn1758 = filteredAnimals(animalList, v -> v.yearNamed == 1758);
        namedIn1758.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        namedIn1758.forEach(n -> System.out.println(n));

        System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
        List<Animal> mammalList = filteredAnimals(animalList, v -> v.move() == "walk");
        mammalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        mammalList.forEach(n -> System.out.println(n));
    }
}
