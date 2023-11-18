import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter text
        System.out.print("Enter text: ");

        // Capture text input from user
        String userInput = scanner.nextLine();

        // Output captured text
        System.out.println("You entered: " + userInput);

        // Close scanner
        scanner.close();
    }
}
