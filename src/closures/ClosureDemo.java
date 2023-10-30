package closures;

public class ClosureDemo {
    public static void main(String[] args) {
        TaskTracker tasks = new TaskTracker();

        tasks.doItNow(string -> System.out.println("Hi "+ string));

        tasks.doItTwice(string -> System.out.println("Hi "+ string));

        tasks.doItLater(string -> System.out.println("Later "+ string));

        System.out.println("done");

        tasks.doDeferredTasks();
    }
}
