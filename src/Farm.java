import animals.Cow;
import animals.Sheep;

public class Farm {
    public static void main(String[] args) {
        Cow[] cowHerd = new Cow[3];
        cowHerd[0] = new Cow("Bessie", 5, 10.5);
        cowHerd[1] = new Cow("Daisy", 4, 8.2);
        cowHerd[2] = new Cow("Molly", 6, 12.0);

        Sheep[] sheepHerd = new Sheep[2];
        sheepHerd[0] = new Sheep("Lamb", 2, 15.0);
        sheepHerd[1] = new Sheep("Ewe", 3, 20.0);

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
}