package src;

/**
 * Represents a task in the to-do list.
 * Each task has a title, description, and completion status.
 */
public class Task {

    /** Title of the task. */
    private String title;

    /** Detailed description of the task. */
    private String description;

    /** Indicates whether the task is completed. */
    private boolean completed;

    /**
     * Creates a new task with a title and description.
     *
     * @param title       the title of the task
     * @param description the detailed description of the task
     */
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    /**
     * Marks this task as completed.
     */
    public void markAsCompleted() {
        this.completed = true;
    }

    /**
     * Returns the completion status of the task.
     *
     * @return true if the task is completed, false otherwise
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Returns the title of the task.
     *
     * @return the title of the task
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the description of the task.
     *
     * @return the description of the task
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns a formatted string representation of the task.
     *
     * @return a string with task details
     */
    @Override
    public String toString() {
        return "[ " + (completed ? "X" : " ") + " ] " + title + " - " + description;
    }
}
