package animals;

public class Cow extends Animal {
    private double milkProduction;
    private static int totalCows = 0;

    public Cow() {
        super();
        this.milkProduction = 1.0;
        totalCows++;
    }

    public Cow(String name, int age, double milkProduction) {
        super(name, age);
        this.milkProduction = milkProduction;
        totalCows++;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Moo!");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Milk Production: " + milkProduction + " liters per day");
    }

    public void graze() {
        System.out.println(getName() + " is grazing in the field.");
    }

    public double getMilkProduction() {
        return milkProduction;
    }

    public void setMilkProduction(double milkProduction) {
        this.milkProduction = milkProduction;
    }

    public static int getTotalCows() {
        return totalCows;
    }

    public static void displayTotalCows() {
        System.out.println("Total number of cows: " + totalCows);
    }
}