/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author user
 */
public class Task {
    private String taskTitle;
    private String Status;

    public Task(String taskTitle, String Status) {
        this.taskTitle = taskTitle;
        this.Status = Status;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getStatus() {
        return Status;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
