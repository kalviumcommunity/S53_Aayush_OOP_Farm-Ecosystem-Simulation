public class FarmService {
    private Farm farm;

    public FarmService() {
        farm = new Farm();
    }

    public void displayAnimalDetails() {
        farm.displayAnimalDetails();
    }

    public void displayTotalAnimals() {
        farm.displayTotalAnimals();
    }

    public void makeAnimalSound(String animalType) {
        farm.makeAnimalSound(animalType);
    }

    public void displayAnimalTypes() {
        System.out.println("Types of animals on the farm:");
        System.out.println("1. Cows");
        System.out.println("2. Sheep");
    }
}