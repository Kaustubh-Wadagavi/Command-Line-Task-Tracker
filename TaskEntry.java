import java.io.Serializable;

public class TaskEntry implements Serializable {

    private String startTime;
    private String endTime;
    private String taskType;
    private String taskName;
    private String taskDescription;

    public TaskEntry() {

    }

    public TaskEntry(String startTime, String endTime, String taskType, String taskName, String taskDescription) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.taskType = taskType;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return taskDescription;
    }

    public void setDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    @Override
    public String toString() {
        return new StringBuffer("Start Time : ").append(this.startTime).append("\nEnd Time : ").append(this.endTime).append("\nType : ").append(this.taskType).append("\n" + this.getTaskType() + " Name : ").append(this.taskName).append("\nDescription : ").append(this.taskDescription).toString();
    }
}