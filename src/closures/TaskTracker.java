package closures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TaskTracker {
    private List<Consumer<String>> tasks = new ArrayList<>();
    private int actionNum = 0;
    
    public void doItNow(Consumer<String> task){
        task.accept("Hello "+ actionNum++);
    }

    public void doItTwice(Consumer<String> task){
        task.accept("Hello "+ actionNum++);
        task.accept("Hello "+ actionNum++);
    }

    public void doItLater(Consumer<String> task){
        tasks.add(task);
    }

    public void doDeferredTasks(){
        for(Consumer<String> task : tasks){
            task.accept("Ahoy "+actionNum++);
        }
    }
}
