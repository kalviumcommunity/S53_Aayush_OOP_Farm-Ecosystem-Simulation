import animals.Cow;
import animals.Sheep;

public class Farm {
    private Cow[] cowHerd;
    private Sheep[] sheepHerd;

    public Farm() {
        cowHerd = new Cow[3];
        cowHerd[0] = new Cow();
        cowHerd[1] = new Cow("Daisy", 4, 8.2);
        cowHerd[2] = new Cow("Molly", 6, 12.0);

        sheepHerd = new Sheep[2];
        sheepHerd[0] = new Sheep();
        sheepHerd[1] = new Sheep("Ewe", 3, 20.0);
    }

    public void displayTotalAnimals() {
        int totalSheep = Cow.getTotalCows() + Sheep.getTotalSheep();
        System.out.println("Total number of animals: " + totalSheep);
    }

    public void displayAnimalDetails() {
        System.out.println("Cow Herd Details:");
        for (Cow cow : cowHerd) {
            cow.displayDetails();
        }
        System.out.println("---------------------------");
        System.out.println("Total Cows: " + Cow.getTotalCows());
        System.out.println("---------------------------");

        System.out.println("Sheep Herd Details:");
        for (Sheep sheep : sheepHerd) {
            sheep.displayDetails();
        }
        System.out.println("---------------------------");
        System.out.println("Total Sheep: " + Sheep.getTotalSheep());
        System.out.println("---------------------------");
    }

    public void displayAnimalTypes() {
        System.out.println("Types of animals on the farm:");
        System.out.println("1. Cows");
        System.out.println("2. Sheep");
    }
}