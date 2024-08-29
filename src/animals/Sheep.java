package animals;

public class Sheep extends Animal {
    private double woolProduction;

    public Sheep(String name, int age, double woolProduction) {
        super(name, age);
        this.woolProduction = woolProduction;
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
}
