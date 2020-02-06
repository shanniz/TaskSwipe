package com.example.shan.taskswipe;

public class Task {
    private int taskId;
    private String taskDesc;
    private String dueDate;

    public Task(int taskId, String taskDesc, String dueDate) {
        this.taskId = taskId;
        this.taskDesc = taskDesc;
        this.dueDate = dueDate;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
