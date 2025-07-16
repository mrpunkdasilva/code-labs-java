package org.gustavojesus;

import java.util.Date;

// Single Responsibility Principle (SRP)
// The Task class is responsible only for storing and managing task information.
class Task {
    private String title;
    private String description;
    private boolean completed;
    private Date creationDate;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
        this.creationDate = new Date();
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public boolean isCompleted() { return completed; }
    public Date getCreationDate() { return creationDate; }

    public void markAsCompleted() {
        this.completed = true;
    }
}