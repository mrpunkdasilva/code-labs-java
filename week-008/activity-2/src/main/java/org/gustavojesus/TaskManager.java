package org.gustavojesus;


import java.util.List;

// Dependency Inversion Principle (DIP)
// The TaskManager class depends on the TaskRepository abstraction, not its specific implementation.
class TaskManager {
    private TaskRepository repository;

    public TaskManager(TaskRepository repository) {
        this.repository = repository;
    }

    public void addTask(String title, String description) {
        Task task = new Task(title, description);
        repository.addTask(task);
    }

    public void completeTask(String title) {
        Task task = repository.findTask(title);
        if (task != null) {
            task.markAsCompleted();
            repository.updateTask(task);
        }
    }

    public void listAllTasks() {
        List<Task> tasks = repository.listTasks();
        tasks.forEach(t -> System.out.println("Task: " + t.getTitle() + " | Completed: " + t.isCompleted() + " | Created on: " + t.getCreationDate()));
    }
}