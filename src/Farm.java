import animals.*;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<AnimalManager> animalManagers;

    public Farm() {
        animalManagers = new ArrayList<>();

        // Adding managers
        animalManagers.add(new CowManager());
        animalManagers.add(new SheepManager());

        // Adding initial animals
        animalManagers.get(0).addAnimal(new Cow("Daisy", 4, 8.2));
        animalManagers.get(0).addAnimal(new Cow("Molly", 6, 12.0));
        animalManagers.get(1).addAnimal(new Sheep("Ewe", 3, 20.0));
    }

    public void displayTotalAnimals() {
        int totalAnimals = animalManagers.stream()
                .mapToInt(AnimalManager::getTotalAnimals)
                .sum();
        System.out.println("Total number of animals: " + totalAnimals);
    }

    public void displayAnimalDetails() {
        for (AnimalManager manager : animalManagers) {
            manager.displayAllDetails();
        }
    }

    public void makeAnimalSound(String animalType) {
        for (AnimalManager manager : animalManagers) {
            if (manager instanceof CowManager && animalType.equalsIgnoreCase("cow")) {
                manager.makeAllSounds();
            } else if (manager instanceof SheepManager && animalType.equalsIgnoreCase("sheep")) {
                manager.makeAllSounds();
            }
        }
    }
}