import java.util.Date;

public class Task {

    private String task;
    private Boolean completed;
    private Date date;

    public Task(String task) {
        this.task = task;
        this.completed = false;
        this.date = new Date();
    }

    public void MarkedAsCompleted() {
        completed = true;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String toString() {
        return "Task: " + task +
                " Completed? " + (completed ? "Yes" : "No") +
                " Date: " +date;
    }
}
