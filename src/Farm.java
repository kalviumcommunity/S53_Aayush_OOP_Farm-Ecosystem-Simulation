import animals.Cow;
import animals.Sheep;

public class Farm {
    public static void main(String[] args) {
        Cow cow1 = new Cow("Bessie", 5, 10.5);
        Cow cow2 = new Cow("Daisy", 4, 8.2);

        Sheep sheep1 = new Sheep("Wooly", 3, 5.5);
        Sheep sheep2 = new Sheep("Fluffy", 4, 6.3);

        cow1.displayDetails();
        cow1.graze();

        cow2.displayDetails();
        cow2.graze();
        
        sheep1.displayDetails();
        sheep1.graze();

        sheep2.displayDetails();
        sheep2.graze();
    }
}