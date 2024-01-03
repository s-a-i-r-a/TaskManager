package TaskUtilities;
import java.time.LocalDateTime;
import Utilities.Priority;
public class Task {
    private String name;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Priority priority;
    private Task previousTask = null, nextTask = null;

    public Task(){

    }
    // First constructor in which start time is current and priority default is low
    public Task(String taskName, String taskDescription, LocalDateTime endTime){
        this.setName(taskName);
        this.setDescription(taskDescription);
        this.setEnd_time(endTime);
        this.setStart_time(LocalDateTime.now());
        this.setPriority(Priority.LOW);
    }
    // Second constructor in which start time is current and priority is user decided
    public Task(String taskName, String taskDescription, LocalDateTime endTime, Priority taskPriority){
        this.setName(taskName);
        this.setDescription(taskDescription);
        this.setEnd_time(endTime);
        this.setStart_time(LocalDateTime.now());
        this.setPriority(taskPriority);
    }
    // Third constructor in which start time is user decided and priority is default low
    public Task(String taskName, String taskDescription, LocalDateTime endTime, LocalDateTime startTime){
        this.setName(taskName);
        this.setDescription(taskDescription);
        this.setEnd_time(endTime);
        this.setStart_time(startTime);
        this.setPriority(Priority.LOW);
    }
    //Forth constructor in which start time is user decided and also priority is user decided
    public Task(String taskName, String taskDescription, LocalDateTime endTime, LocalDateTime startTime, Priority taskPriority){
        this.setName(taskName);
        this.setDescription(taskDescription);
        this.setEnd_time(endTime);
        this.setStart_time(startTime);
        this.setPriority(taskPriority);
    }


    //setters and getters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    public void setStart_time(LocalDateTime start_time){
        this.startTime = start_time;
    }
    public LocalDateTime getStart_time(){
        return startTime;
    }

    public void setEnd_time(LocalDateTime end_time){
        this.endTime = end_time;
    }
    public LocalDateTime getEnd_time(){
        return endTime;
    }

    public void setPriority(Priority low){
        this.priority = priority;
    }
    public Priority getPriority(){
        return priority;
    }

    public void setPreviousTask(Task previousTask){
        this.previousTask = previousTask;
    }
    public Task getPreviousTask(){
        return previousTask;
    }

    public void setNextTask(Task nextTask){
        this.nextTask = nextTask;
    }
    public Task getNextTask(){
        return nextTask;
    }

    //method for time if want to reset
    public void rescheduleTask(LocalDateTime newStartTime, LocalDateTime newEndTime){
        this.setStart_time(newStartTime);
        this.setEnd_time(newEndTime);
    }

    public String showTask(){
            StringBuilder result = new StringBuilder();
            result.append("Task Name: "+this.getName());
            result.append("\nTask Description: "+this.getDescription());
            result.append("\nTask Start Time: "+this.getStart_time());
            result.append("\nTask End Time: "+this.getEnd_time());
            result.append("\nTask Priority: "+this.getPriority());
            result.append("\nTask Next Task: "+this.getNextTask());
            return result.toString();
    }

    @Override
    public String toString() {
        return "Task Name: "+ name;
    }
}
