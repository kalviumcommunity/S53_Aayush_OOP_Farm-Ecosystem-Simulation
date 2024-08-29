package animals;

public class Cow extends Animal {
    private double milkProduction;

    public Cow(String name, int age, double milkProduction) {
        super(name, age);
        this.milkProduction = milkProduction;
    }

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
}