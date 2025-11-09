package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages a list of {@link Task} objects.
 * Provides operations to add, list, and complete tasks.
 */
public class TaskManager {

    /** Stores all created tasks. */
    private List<Task> tasks;

    /** Creates an empty task manager. */
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    /**
     * Adds a new task to the list.
     *
     * @param title       the title of the task
     * @param description the description of the task
     */
    public void addTask(String title, String description) {
        Task task = new Task(title, description);
        tasks.add(task);
    }

    /**
     * Marks a task as completed by its index.
     *
     * @param index the index of the task to complete
     * @throws IndexOutOfBoundsException if index is invalid
     */
    public void completeTask(int index) throws IndexOutOfBoundsException {
        tasks.get(index).markAsCompleted();
    }

    /**
     * Returns all tasks in the list.
     *
     * @return a list of all {@link Task} objects
     */
    public List<Task> getAllTasks() {
        return tasks;
    }

    /**
     * Displays all tasks in the console.
     */
    public void showAllTasks() {
        System.out.println("\n==== To-Do List ====");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i));
        }
    }
}
