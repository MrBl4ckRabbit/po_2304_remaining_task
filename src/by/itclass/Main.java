package by.itclass;

import by.itclass.model.Cat;
import by.itclass.model.Dog;
import by.itclass.utils.CompetitionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static by.itclass.utils.CompetitionUtils.*;

public class Main {
    public static void main(String[] args) {

        var cats = new ArrayList<Cat>();
        var dogs = new ArrayList<Dog>();
        var errors = new HashMap<String, String>();

        CompetitionUtils.parseFile(cats, dogs, errors);

        var sortedCats = sortByBirthDate(cats);
        var sortedDogs = sortByBirthDate(dogs);
        printResults(sortedCats, sortedDogs, errors);

        var youngCats = filterAnimals(sortedCats, true);
        var oldCats = filterAnimals(sortedCats, false);
        var youngDogs = filterAnimals(sortedDogs, true);
        var oldDogs = filterAnimals(sortedDogs, false);

        printResults(youngCats, youngDogs, oldCats, oldDogs, errors);
    }
}
// cats.forEach(System.out::println);
// System.out.println("========================");
//dogs.forEach(System.out::println);
//System.out.println("========================");
//errors.entrySet().forEach(it-> System.out.println(it.getKey()+"; "+it.getValue()));