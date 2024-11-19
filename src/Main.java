import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Farm farm = new Farm();

        while (true) {
            System.out.println("\nWelcome to the Farm!");
            System.out.println("Please select an option:");
            System.out.println("1. View total number of animals");
            System.out.println("2. View details of all animals");
            System.out.println("3. View types of animals");
            System.out.println("4. Make an animal sound");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    farm.displayTotalAnimals();
                    break;
                case 2:
                    farm.displayAnimalDetails();
                    break;
                case 3:
                    farm.displayAnimalTypes();
                    break;
                case 4:
                    System.out.print("Enter the animal type (Cow/Sheep): ");
                    String animalType = scanner.nextLine().trim();
                    farm.makeAnimalSound(animalType);
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.print("Would you like to go back to the main menu? (y/n): ");
            String goBack = scanner.nextLine().trim().toLowerCase();
            if (!goBack.equals("y")) {
                System.out.println("Exiting the program. Goodbye!");
                scanner.close();
                return;
            }
        }
    }
}