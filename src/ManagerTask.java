import java.util.ArrayList;

public class ManagerTask {

    private ArrayList<Task> TaskList;

    public ManagerTask() {
        this.TaskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        TaskList.add(task);
    }

    public void showList() {
        for(Task task : TaskList) {
            System.out.println(task);
            System.out.println("...........................");
        }
    }

}
