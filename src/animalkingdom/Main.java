package animalkingdom;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections; // required import for sorting the ArrayList
import java.util.Comparator;  // required import for sorting the ArrayList in descending order

public class Main 
{
    // private static List<Animal> filteredAnimals(List<Animal> animals, CheckAnimal tester)
	// {
	// 	List<Animal> tempList = new ArrayList<>();
	// 	for (Animal v : animals)
	// 	{
	// 		if (tester.test(v))
	// 		{
	// 			tempList.add(v);
	// 		}
	// 	}
	// 	return tempList;
	// }
    public static void main(String[] args) {
        // System.out.println("testing complier");
        // System.out.println();

        // creating some mammals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1759);
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

        System.out.println(animalList);

        // Collections.sort(animalList);

        System.out.println("\n*** List all the animals in descending order by year named  ***");
        animalList.sort((v1, v2) -> v2.getYearNamed() - v1.getYearNamed());
        animalList.forEach(n -> System.out.println(n));

        System.out.println("\n*** List all the animals alphabetically ***");
        animalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        animalList.forEach(n -> System.out.println(n));

        System.out.println("\n***List all the animals order by how they move ***");


        System.out.println("\n*** List only those animals the breath with lungs ***");
        // List<Animal> filteredList = breatheWithLungs(animalList, v -> v.getBreathe() = "lungs");

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");

        System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");

    }
}
