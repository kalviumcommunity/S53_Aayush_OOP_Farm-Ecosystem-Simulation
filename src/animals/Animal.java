package animals;

public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
        this.name = "Sample Animal";
        this.age = 5;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayDetails();

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}