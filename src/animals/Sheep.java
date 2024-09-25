package animals;

public class Sheep extends Animal {
    private double woolProduction;
    private static int totalSheep = 0;

    public Sheep(String name, int age, double woolProduction) {
        super(name, age);
        this.woolProduction = woolProduction;
        totalSheep++;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wool Production: " + woolProduction + " kilograms per year");
    }

    public void graze() {
        System.out.println(getName() + " is grazing in the meadow.");
    }

    public double getWoolProduction() {
        return woolProduction;
    }

    public void setWoolProduction(double woolProduction) {
        this.woolProduction = woolProduction;
    }

    public static int getTotalSheep() {
        return totalSheep;
    }

    public static void displayTotalSheep() {
        System.out.println("Total number of sheep: " + totalSheep);
    }
}