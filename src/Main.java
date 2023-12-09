public class Main {
    public static void main(String[] args) {

        ManagerTask managerTask = new ManagerTask();

        Task task1 = new Task("Study Java");
        Task task2 = new Task("Go to the Gym");

        managerTask.addTask(task1);
        managerTask.addTask(task2);

        task2.MarkedAsCompleted();
        
        managerTask.showList();

    }
}