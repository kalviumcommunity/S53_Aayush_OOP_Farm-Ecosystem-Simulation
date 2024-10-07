package animals;

public class Animal {
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

    public void displayDetails() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age + " years");
    }

    public void makeSound() {
        System.out.println(name + " is making a sound!");
    }

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