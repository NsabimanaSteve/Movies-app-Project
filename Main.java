import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        // Continuously prompt the user for options until they choose to exit
        while (true) {
            try {
                System.out.println("Select an option:");
                System.out.println("1. Test CustomArrayList");
                System.out.println("2. Test MovieListApp");
                System.out.println("3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear the newline character left in the buffer

                switch (choice) {
                    case 1:
                        testCustomArrayList(scanner);
                        break;
                    case 2:
                        testMovieListApp(scanner);
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the newline character left in the buffer

            }
        }
    }

    // Method to test CustomArrayList interactively
    private static void testCustomArrayList(Scanner scanner) {
        CustomArrayList customList = new CustomArrayList();

        System.out.println("==========================================================");
        System.out.println("Testing CustomArrayList...");
        System.out.println("==========================================================\n");

        // Continuously prompt the user for operations until they choose to exit
        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Add element");
            System.out.println("2. Get element by index");
            System.out.println("3. Set element by index");
            System.out.println("4. Remove element by index");
            System.out.println("5. Remove element by value");
            System.out.println("6. Display list");
            System.out.println("7. Check if list is empty");
            System.out.println("8. Get list size");
            System.out.println("9. Exit CustomArrayList test");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character left in the buffer

            switch (choice) {
                case 1:
                    // Add an element to the list
                    System.out.print("Enter element to add: ");
                    String elementToAdd = scanner.nextLine();
                    customList.add(elementToAdd);
                    System.out.println("Element added.");
                    break;
                case 2:
                    // Retrieve an element from the list by index
                    System.out.print("Enter index to get element: ");
                    int getIndex = scanner.nextInt();
                    scanner.nextLine(); // Clear the newline character left in the buffer
                    System.out.println("Element at index " + getIndex + ": " + customList.get(getIndex));
                    break;
                case 3:
                    // Set an element in the list by index
                    System.out.print("Enter index to set element: ");
                    int setIndex = scanner.nextInt();
                    scanner.nextLine(); // Clear the newline character left in the buffer
                    System.out.print("Enter new element: ");
                    String newElement = scanner.nextLine();
                    customList.set(setIndex, newElement);
                    System.out.println("Element set.");
                    break;
                case 4:
                    // Remove an element from the list by index
                    System.out.print("Enter index to remove element: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine(); // Clear the newline character left in the buffer
                    System.out.println("Removed element: " + customList.remove(removeIndex));
                    break;
                case 5:
                    // Remove an element from the list by value
                    System.out.print("Enter value to remove: ");
                    String valueToRemove = scanner.nextLine();
                    System.out.println("Removed element: " + customList.remove(valueToRemove));
                    break;
                case 6:
                    // Display the current list
                    System.out.println("Current list: " + customList.display());
                    break;
                case 7:
                    // Check if the list is empty
                    System.out.println("Is list empty? " + customList.isEmpty());
                    break;
                case 8:
                    // Get the size of the list
                    System.out.println("List size: " + customList.size());
                    break;
                case 9:
                    // Exit the CustomArrayList test
                    System.out.println("Exiting CustomArrayList test...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to test MovieListApp interactively
    private static void testMovieListApp(Scanner scanner) {
        MovieListApp movieListApp = new MovieListApp();

        System.out.println("\n==========================================================");
        System.out.println("Testing MovieListApp...");
        System.out.println("==========================================================\n");

        // Continuously prompt the user for operations until they choose to exit
        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Add movie");
            System.out.println("2. Remove movie");
            System.out.println("3. Display movies");
            System.out.println("4. Calculate average rating");
            System.out.println("5. Exit MovieListApp test");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character left in the buffer

            switch (choice) {
                case 1:
                    // Add a movie to the MovieListApp
                    System.out.print("Enter movie title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter release year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter rating: ");
                    double rating = scanner.nextDouble();
                    scanner.nextLine(); // Clear the newline character left in the buffer
                    movieListApp.addMovie(title, year, rating);
                   
                    System.out.println("Movie added.");
                    break;
                case 2:
                    // Remove a movie from the MovieListApp
                    System.out.print("Enter movie title to remove: ");
                    String titleToRemove = scanner.nextLine();
                    movieListApp.removeMovie(titleToRemove);
                    System.out.println("Movie removed.");
                    break;
                case 3:
                    // Display the current list of movies
                    System.out.println("Current Movies:");
                    System.out.println(movieListApp.displayMovies());
                    break;
                case 4:
                    // Calculate and display the average rating of movies
                    double averageRating = movieListApp.calculateAverageRating();
                    System.out.println("Average Rating: " + averageRating);
                    break;
                case 5:
                    // Exit the MovieListApp test
                    System.out.println("Exiting MovieListApp test...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
