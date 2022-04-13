package exercises.technology;

public class Computer extends AbstractEntity{
    Integer deviceID;
    String assignedTo;
    String accessLevel;
    String status;

    //constructors
    public Computer(){
        deviceID = increment();
    }
    public Computer(String aAssignedTo, String aAccessLevel, String aStatus){
        this();
        assignedTo = aAssignedTo;
        accessLevel = aAccessLevel;
        status = aStatus;
    }
    //getters
    public Integer getDeviceID() {
        return deviceID;
    }
    public String getAssignedTo() {
        return assignedTo;
    }
    public String getAccessLevel() {
        return accessLevel;
    }
    public String getStatus() {
        return status;
    }

    //setters
    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    //Overrides
    @Override
    public int increment() {
        return ++value;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "deviceID=" + deviceID +
                ", assignedTo='" + assignedTo + '\'' +
                ", accessLevel='" + accessLevel + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
