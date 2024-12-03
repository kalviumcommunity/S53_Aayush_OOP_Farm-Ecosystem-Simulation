package animals;

import java.util.ArrayList;
import java.util.List;

public class SheepManager implements AnimalManager {
    private List<Sheep> sheepHerd;

    public SheepManager() {
        this.sheepHerd = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Sheep) {
            sheepHerd.add((Sheep) animal);
        }
    }

    @Override
    public void displayAllDetails() {
        System.out.println("Sheep Herd Details:");
        for (Sheep sheep : sheepHerd) {
            sheep.displayDetails();
        }
        System.out.println("---------------------------");
    }

    @Override
    public void makeAllSounds() {
        for (Sheep sheep : sheepHerd) {
            sheep.makeSound();
        }
    }

    @Override
    public int getTotalAnimals() {
        return sheepHerd.size();
    }
}