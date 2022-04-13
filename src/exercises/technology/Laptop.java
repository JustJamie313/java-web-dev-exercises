package exercises.technology;

import java.util.Date;

public class Laptop extends Computer{
    Date inService;
    String operatingSystem;

    //constructors
    public Laptop(String aOperatingSystem, String aAssignedTo, String aAccessLevel, String aStatus){
        super(aAssignedTo, aAccessLevel, aStatus);
        inService = new Date();
        operatingSystem = aOperatingSystem;
    }

    //getters
    public Date getInService() {
        return inService;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }

    //setters
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    //Overrides
    @Override
    public String toString() {
        return super.toString() + "\nLaptop{" +
                "inService=" + inService +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }

    //methods
    public void updateStatus(String aStatus){
        this.status = aStatus;
    }
}
