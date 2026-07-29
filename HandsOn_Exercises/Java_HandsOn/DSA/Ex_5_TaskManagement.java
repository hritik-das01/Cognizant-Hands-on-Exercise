package HandsOn_Exercises.DSA;

class Task {

    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }
}

public class Ex_5_TaskManagement {

    static Task head = null;

    static void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newTask;
    }

    static void searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {
                System.out.println("Task Found");
                System.out.println("ID : " + temp.taskId);
                System.out.println("Name : " + temp.taskName);
                System.out.println("Status : " + temp.status);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    static void displayTasks() {

        Task temp = head;

        while (temp != null) {

            System.out.println(
                    temp.taskId + " " +
                    temp.taskName + " " +
                    temp.status);

            temp = temp.next;
        }
    }

    static void deleteTask(int id) {

        if (head == null)
            return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Task Deleted");
        } else {
            System.out.println("Task Not Found");
        }
    }

    public static void main(String[] args) {

        addTask(101, "Blue Print", "Pending");
        addTask(102, "Write Code", "In Progress");
        addTask(103, "Testing", "Pending");

        System.out.println("All Tasks:");
        displayTasks();

        System.out.println("\nSearching Task 102:");
        searchTask(102);

        System.out.println("\nDeleting Task 102:");
        deleteTask(102);

        System.out.println("\nTasks After Deletion:");
        displayTasks();
    }
}