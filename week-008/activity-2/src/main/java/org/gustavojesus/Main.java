package org.gustavojesus;

// Testing SOLID principles
public class Main {
    public static void main(String[] args) {
        TaskRepository repository = new InMemoryTaskRepository();
        TaskManager manager = new TaskManager(repository);

        manager.addTask("Study SOLID", "Learn about SOLID principles.");
        manager.addTask("Implement Project", "Create a system based on SOLID.");
        manager.listAllTasks();

        manager.completeTask("Study SOLID");

        manager.listAllTasks();
    }
}
