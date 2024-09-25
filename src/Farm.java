import animals.Cow;
import animals.Sheep;

public class Farm {
    public static void main(String[] args) {
        Cow[] cowHerd = new Cow[3];
        Sheep[] sheepHerd = new Sheep[3];

        cowHerd[0] = new Cow("Bessie", 5, 10.5);
        cowHerd[1] = new Cow("Daisy", 4, 8.2);
        cowHerd[2] = new Cow("Molly", 6, 12.0);

        sheepHerd[0] = new Sheep("Lamb", 3, 15.0);
        sheepHerd[1] = new Sheep("Dolly", 4, 20.0);
        sheepHerd[2] = new Sheep("Ewe", 5, 18.0);

        System.out.println("Cow herd:");
        for (int i = 0; i < cowHerd.length; i++) {
            System.out.println("Cow " + (i + 1) + " details:");
            cowHerd[i].displayDetails();
        }

        System.out.println("--------------------------");
        System.out.println("Sheep herd:");

        for (int i = 0; i < sheepHerd.length; i++) {
            System.out.println("Sheep " + (i + 1) + " details:");
            sheepHerd[i].displayDetails();
        }
    }
}