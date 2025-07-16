package org.gustavojesus;


import java.util.ArrayList;
import java.util.List;

// In-memory repository implementation
// Follows OCP as we can create other implementations without modifying this class.
class InMemoryTaskRepository implements TaskRepository {
    private List<Task> tasks = new ArrayList<>();

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void updateTask(Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTitle().equals(task.getTitle())) {
                tasks.set(i, task);
                break;
            }
        }
    }

    @Override
    public Task findTask(String title) {
        return tasks.stream().filter(t -> t.getTitle().equals(title)).findFirst().orElse(null);
    }

    @Override
    public List<Task> listTasks() {
        return new ArrayList<>(tasks);
    }
}
