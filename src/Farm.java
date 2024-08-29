import animals.Cow;

public class Farm {
    public static void main(String[] args) {
        Cow[] cowHerd = new Cow[3];

        cowHerd[0] = new Cow("Bessie", 5, 10.5);
        cowHerd[1] = new Cow("Daisy", 4, 8.2);
        cowHerd[2] = new Cow("Molly", 6, 12.0);

        for (int i = 0; i < cowHerd.length; i++) {
            System.out.println("Cow " + (i + 1) + " details:");
            cowHerd[i].displayDetails();
        }
    }
}
