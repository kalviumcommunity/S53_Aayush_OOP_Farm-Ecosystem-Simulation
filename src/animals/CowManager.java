package animals;

import java.util.ArrayList;
import java.util.List;

public class CowManager implements AnimalManager {
    private List<Cow> cowHerd;

    public CowManager() {
        this.cowHerd = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Cow) {
            cowHerd.add((Cow) animal);
        }
    }

    @Override
    public void displayAllDetails() {
        System.out.println("Cow Herd Details:");
        for (Cow cow : cowHerd) {
            cow.displayDetails();
        }
        System.out.println("---------------------------");
    }

    @Override
    public void makeAllSounds() {
        for (Cow cow : cowHerd) {
            cow.makeSound();
        }
    }

    @Override
    public int getTotalAnimals() {
        return cowHerd.size();
    }
}