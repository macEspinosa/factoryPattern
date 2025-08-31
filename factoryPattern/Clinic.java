package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose a pet:");
            System.out.println("1. Cat");
            System.out.println("2. Dog");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                Cat cat = new Cat(9); // cats have 9 lives
                System.out.println("Cat selected.");
                System.out.println("Number of lives: " + cat.noofLives());
                System.out.println("Sound: " + cat.makeSound());
                System.out.println("Play: " + cat.play());

            } else if (choice == 2) {
                System.out.print("Enter dog breed: ");
                String breed = scanner.nextLine();
                Dog dog = new Dog(breed);
                System.out.println("Dog selected.");
                System.out.println("Breed: " + dog.getBreed());
                System.out.println("Sound: " + dog.makeSound());
                System.out.println("Play: " + dog.play());

            } else if (choice == 3) {
                System.out.println("Exiting program...");
                break;

            } else {
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
