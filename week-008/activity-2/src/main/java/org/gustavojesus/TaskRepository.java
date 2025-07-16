package org.gustavojesus;

import java.util.List;

// Open/Closed Principle (OCP) and Liskov Substitution Principle (LSP)
// We create an interface to allow different repository implementations.
interface TaskRepository {
    void addTask(Task task);
    void updateTask(Task task);
    Task findTask(String title);
    List<Task> listTasks();
}