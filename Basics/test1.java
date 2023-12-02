import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Enter your choice:");
            System.out.println("1 - Execute some code");
            System.out.println("2 - Print current time in seconds");
            System.out.println("0 - Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Execute your code here
                    System.out.println("Code is executed.");
                    break;
                case 2:
                    // Print current time in seconds
                    long currentTimeMillis = System.currentTimeMillis();
                    long currentTimeSeconds = currentTimeMillis / 1000;
                    System.out.println("Current time in seconds: " + currentTimeSeconds);
                    break;
                case 0:
                    // Exit the loop and program
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        // Close the scanner
        scanner.close();
        System.out.println("Program has exited.");
    }
}
