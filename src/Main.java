package src;

import java.util.Scanner;

/**
 * The main class that runs the To-Do List application.
 * Demonstrates adding, listing, and completing tasks.
 */
public class Main {

    /**
     * Entry point of the application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner input = new Scanner(System.in);

        System.out.println("=== Simple To-Do App ===");

        boolean running = true;
        while (running) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = input.nextLine();

                    System.out.print("Description: ");
                    String desc = input.nextLine();

                    manager.addTask(title, desc);
                    break;

                case 2:
                    manager.showAllTasks();
                    break;

                case 3:
                    System.out.print("Enter task index: ");
                    int index = input.nextInt();
                    try {
                        manager.completeTask(index);
                        System.out.println("Task completed!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        input.close();
        System.out.println("Goodbye!");
    }
}
